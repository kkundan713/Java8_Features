package Lambda_Expression;

interface NoParameter{
	public String say();
}

public class LambdaEpressionExample2 {

	public static void main(String[] args) {
		NoParameter parameter=new NoParameter() {

			@Override
			public String say() {
				
				return"Welcome to LambdaExpression";
			}
			
			
		};
		parameter.say();

	}

}
