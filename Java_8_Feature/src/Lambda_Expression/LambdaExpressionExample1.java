package Lambda_Expression;

interface  Drawable{  
    public void draw();  
} 

public class LambdaExpressionExample1 {  
    public static void main(String[] args) {  
        int width=10;         
        //with lambda 
        Drawable withLambda=()->{  
            System.out.println("Drawing "+width);  
        };  
        withLambda.draw();  
    }  
} 
