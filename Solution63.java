// Magical number -> Replace 0 with 1 and 1 with 2. 

public class Code1{
    public static void printMagicalNumbers(int n){
        String str = Integer.toBinaryString(n);

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c == '1'){
                sb.append('2');
            }else{
                sb.append('1');
            }
        }

        int number = Integer.parseInt(sb.toString());
        if(number % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        int N = 5;
        
        printMagicalNumbers(N);
    }
}
