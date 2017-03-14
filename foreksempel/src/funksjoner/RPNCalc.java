package funksjoner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class RPNCalc {

	private Map<String, BinaryOperator<Double>> binaryOperators = new HashMap<>();
	private Map<String, UnaryOperator<Double>> unaryOperators = new HashMap<>();
	private Map<String, Supplier<Double>> constants = new HashMap<>();

	private Stack<Double> operandStack = new Stack<>();
	
	public RPNCalc() {
		binaryOperators.put("+", (d1, d2) -> d1 + d2);
		binaryOperators.put("-", (d1, d2) -> d2 - d1);
		binaryOperators.put("*", (d1, d2) -> d1 * d2);
		binaryOperators.put("/", (d1, d2) -> d2 / d1);

		unaryOperators.put("√", (d) -> Math.sqrt(d));
		constants.put("π", () -> Math.PI);
		constants.put("e", () -> Math.E);
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
		   if (scanner.hasNextDouble()) {
		      double d = scanner.nextDouble();
		      operandStack.push(d);
		   } else {
		      String op = scanner.next();
		      if (binaryOperators.containsKey(op)) {
		         double d1 = operandStack.pop(), d2 = operandStack.pop();
		         BinaryOperator<Double> operator2 = binaryOperators.get(op);
		         operandStack.push(operator2.apply(d1, d2));
		      } else if (unaryOperators.containsKey(op)) {
		         double d1 = operandStack.pop();
		         UnaryOperator<Double> operator1 = unaryOperators.get(op);
		         operandStack.push(operator1.apply(d1));
		      } else if (constants.containsKey(op)) {
		         Supplier<Double> operator0 = constants.get(op);
		         operandStack.push(operator0.get());
		      }
		   }
		   System.out.println(operandStack);
		}
		scanner.close();	
	}
	
	public static void main(String[] args) {
		new RPNCalc().run();
	}
}
