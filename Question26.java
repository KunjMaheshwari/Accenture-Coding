//Password validator

public class Question26 {
    public static int CheckPassword(String str){
        if(str.length() < 4){
            return 0;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == ' ' || ch == '/'){
                return 0;
            }

            if(Character.isDigit(ch)){
                hasDigit = true;
            }

            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
        }

        if(Character.isDigit(str.charAt(0))){
            return 0;
        }

        if(hasDigit && hasUpperCase){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        String password1 = "A1bcdef";
        String password2 = "1234";
        String password3 = "abcD";
        String password4 = "Ab cd";
        String password5 = "/Abcd";
        String password6 = "A1b c";

        System.out.println(CheckPassword(password1)); // Output: 1
        System.out.println(CheckPassword(password2)); // Output: 0
        System.out.println(CheckPassword(password3)); // Output: 0
        System.out.println(CheckPassword(password4)); // Output: 0
        System.out.println(CheckPassword(password5)); // Output: 0
        System.out.println(CheckPassword(password6)); // Output: 0        
    }
}
