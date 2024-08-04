// Binary Operation 

public class Question20 {
    // Function to perform AND operation on two binary strings
    public static String andOperation(String binary1, String binary2) {
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int andResult = num1 & num2;
        return Integer.toBinaryString(andResult);
    }

    // Function to perform OR operation on two binary strings
    public static String orOperation(String binary1, String binary2) {
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int orResult = num1 | num2;
        return Integer.toBinaryString(orResult);
    }

    // Function to perform XOR operation on two binary strings
    public static String xorOperation(String binary1, String binary2) {
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int xorResult = num1 ^ num2;
        return Integer.toBinaryString(xorResult);
    }

    public static String calculateBinaryOperations(String input) {
        String tokens[] = input.split(" ");
        String result = tokens[0];

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            String nextBinary = tokens[i + 1];

            switch (operator) {
                case "AND":
                    result = andOperation(result, nextBinary);
                    break;
                case "OR":
                    result = orOperation(result, nextBinary);
                    break;
                case "XOR":
                    result = xorOperation(result, nextBinary);
                    break;
                default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example input string with binary numbers and operators
        String input = "1101 AND 1011 OR 0110 XOR 0101";

        // Calculate the result of the binary operations
        String result = calculateBinaryOperations(input);

        // Print the result
        System.out.println("Result of binary operations: " + result);
    }
}
