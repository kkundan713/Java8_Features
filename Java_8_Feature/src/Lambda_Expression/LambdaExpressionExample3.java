package Lambda_Expression;

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		Runnable runnable= new Runnable(){

			@Override
			public void run() {
				 System.out.println(" Runnable example without lambda exp.");
				
			}
			
		};
		Thread thread=new Thread(runnable);
		thread.start();

	}

}
