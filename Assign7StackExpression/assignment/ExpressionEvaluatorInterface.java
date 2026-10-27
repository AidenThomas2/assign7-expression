package assignment;

public interface ExpressionEvaluatorInterface {
    /**
     * Converts a mathematical expression from infix order to postfix order.
     * @param infix the standard infix string (e.g., "(3 + 5) * 2")
     * @return the equivalent postfix string (e.g., "3 5 + 2 *")
     */
    public String infixToPostfix(String infix);

    /**
     * Evaluates a mathematical expression given in postfix order.
     * @param postfix the postfix string (e.g., "3 5 + 2 *")
     * @return the integer result of the evaluation
     */
    public int evaluatePostfix(String postfix);
}

