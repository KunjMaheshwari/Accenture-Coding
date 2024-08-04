//Binary operations on string

public class Question19{
    // AND Operation
    public static String andOperation(String str1, String str2){
        int num1 = Integer.parseInt(str1, 2);
        int num2 = Integer.parseInt(str2, 2);
        int addResult = num1 & num2;
        return Integer.toBinaryString(addResult);
    }

    //OR Operation
    public static String orOperation(String str1, String str2){
        int num1 = Integer.parseInt(str1, 2);
        int num2 = Integer.parseInt(str2, 2);
        int orResult = num1 | num2;
        return Integer.toBinaryString(orResult);
    }

    //XOR Operation
    public static String xorOperation(String str1, String str2){
        int num1 = Integer.parseInt(str1, 2);
        int num2 = Integer.parseInt(str2, 2);

        int xorResult = num1 ^ num2;
        return Integer.toBinaryString(xorResult);
    }

    public static void main(String[] args) {
        String binary1 = "1101";
        String binary2 = "1011";   
        
        System.out.println(andOperation(binary1, binary2));
        System.out.println(orOperation(binary1, binary2));
        System.out.println(xorOperation(binary1, binary2));
    } 
}