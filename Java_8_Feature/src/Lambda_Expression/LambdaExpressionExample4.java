package Lambda_Expression;

public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		Runnable runnable=()->System.out.println("Runnable example with lambda exp.");
		Thread thread=new Thread(runnable);
		thread.start();

	}

}
