//Operation choice

public class Question22 {
    public enum Operation{
        ADDITION, SUBSTRACTION, MULTIPLICATION, DIVISION
    }
    public static double performOperation(double num1, double num2, Operation operation){
        switch(operation){
            case ADDITION:
                return num1+num2;
            case SUBSTRACTION:
                return num1-num2;
            case MULTIPLICATION:
                return num1*num2;
            case DIVISION:
                return num1/num2;
            default:
                throw new IllegalArgumentException ("Invalid operation" +operation);
        }
    }
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        double resultAddition = performOperation(num1, num2, Operation.ADDITION);
        System.out.println(resultAddition);

        // similarly 
    }
}
