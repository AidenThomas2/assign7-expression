package assignment;

public class ExpressionEvaluator<T> extends Stack<T> implements ExpressionEvaluatorInterface {
	Stack<String> stack = new Stack<String>();
	@Override
	public String infixToPostfix(String infix) {
		String postfix = "";
		String removeSpaces = infix.replaceAll(" ", "");
		String[] split = removeSpaces.split("");
		for (int i = 0; i < split.length; i++) {
			switch (split[i]) {
			case "*": 
				stack.push("*");
				break;
			case "/": 
				stack.push("/");
				break;
			case "+": 
				stack.push("+");
				break;
			case "-": 
				stack.push("-");
				break;
			case "(":
				stack.push("(");
				break;
			case ")":
				String current = stack.peek();
				while (!(current.equals("("))) {
					postfix += stack.pop();
					current = stack.peek();
				}
				break;
			default:  
				postfix += split[i] + " ";
			}
		}
		return postfix;
	}

	@Override
	public int evaluatePostfix(String postfix) {
		// TODO Auto-generated method stub
		return 0;
	}

}
