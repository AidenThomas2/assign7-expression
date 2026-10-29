package assignment;

public class Driver<T> extends ExpressionEvaluator<T> {
    public static void main(String[] args) {
      ExpressionEvaluator<String> exp = new ExpressionEvaluator<String>();
      System.out.println(exp.infixToPostfix("(7+1)"));
    }
}

