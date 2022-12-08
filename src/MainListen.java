import java.util.Objects;
import java.util.Stack;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class MainListen extends CalculatorBaseListener {

    private final Stack<Double> stack = new Stack<>();

    public Double getResult() {
        return stack.peek();
    }

    private boolean symbolEquals(ParseTree child, int symbol) {
        return ((TerminalNode) child).getSymbol().getType() == symbol;
    }
    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx){
        Double result = stack.pop();
        System.out.println("# " + ctx.getChildCount());
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.PLUS)) {
                result += stack.pop();
            } else {
                result =  stack.pop()- result;
            }
        }
        stack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
    }
    @Override
    public void exitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx){
        Double result = stack.pop();
        System.out.println("## " + ctx.getChildCount());
        for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = stack.pop() * result;
            }else if(symbolEquals(ctx.getChild(i), CalculatorParser.DIV)) {
                result = stack.pop() / result;
            }else {
                result = stack.pop() % result ;
            }
        }
        stack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);

    }

    @Override
    public void exitPovsqrExpression(CalculatorParser.PovsqrExpressionContext ctx){;
        double result = stack.pop();
        System.out.println("### " + ctx.getChildCount());
        if(ctx.SQRT()==null) {
            for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
                if (symbolEquals(ctx.getChild(i), CalculatorParser.POV)) {
                    result = Math.pow(stack.pop(), result);
                }
            }
        }else{
            if (symbolEquals(ctx.getChild(0), CalculatorParser.SQRT)) {
                result = Math.sqrt(result);
            }
        }
        stack.push( result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
    }


    @Override
    public void exitSing_simple(CalculatorParser.Sing_simpleContext ctx){
        double result = stack.pop();

        if(ctx.LABS()!=null && ctx.PABS()!=null){
            result = Math.abs(result);
        }
        if(ctx.MINUS()!=null){
            result = result * -1;
        }



        if(ctx.funcname()!=null) {
            for (int i = ctx.getChildCount(); i >= 1; i = i - 2) {
                if (Objects.equals(ctx.funcname().getChild(i - 2).getText(), ctx.getChild(i - 2).getText())) {
                    if(ctx.funcname().COS()!=null) result=Math.cos(result);
                    if(ctx.funcname().SIN()!=null) result=Math.sin(result);
                    if(ctx.funcname().TAN()!=null) result=Math.tan(result);
                    if(ctx.funcname().ACOS()!=null) result=Math.acos(result);
                    if(ctx.funcname().ASIN()!=null) result=Math.asin(result);
                    if(ctx.funcname().ATAN()!=null) result=Math.atan(result);
                    if(ctx.funcname().LOG ()!=null) result=Math.log(result);
                    if(ctx.funcname().PI ()!=null) result=result * Math.PI;
                    if(ctx.funcname().E ()!=null) result=result * Math.E;
                }
            }
        }
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
        stack.push(result);

    }

    @Override
    public void exitSimple(CalculatorParser.SimpleContext ctx) {
            if (ctx.FLOAT() != null) {
                double value = Double.parseDouble(ctx.FLOAT().getText());
                stack.push(value);
                System.out.println("Float:" + value);
            } else {
                double value = Integer.parseInt(ctx.INT().getText());
                stack.push(value);
                System.out.println("INT:" + value);
            }
        }




    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName("C:\\Users\\mag46\\Documents\\Antlar44-master\\Antlar44-master\\src\\example.txt");
        CalculatorLexer lexer = new CalculatorLexer(charStreams);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression(); // parse

        ParseTreeWalker walker = new ParseTreeWalker();
        MainListen listener = new MainListen();
        walker.walk(listener, tree);
        System.out.println(listener.getResult());
    }


}
