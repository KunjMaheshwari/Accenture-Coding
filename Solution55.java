public class Code1{
    public static void main(String args[]){
        String n = "121";

        int rem = 0;
        for(int i=0;i<n.length();i++){
            int currentCharacter = n.charAt(i) - '0';
            rem = (rem*10+currentCharacter) % 11;
        }
        System.out.println(rem);
    }
}
