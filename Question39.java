public class Question39 {
    public static String replaceStringCharacters(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'){
                newStr += 'b';
            }else if(str.charAt(i) == 'b'){
                newStr += 'a';
            }else{
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaabbbaaa";

        System.out.println(replaceStringCharacters(str));
    }
}
