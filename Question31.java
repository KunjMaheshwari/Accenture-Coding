//Two players a and B are playing the game of rock paper and scissors player a chose a move represented by string M and can move 1 of the following rock paper or scissor rock beat scissors scissor beats paper and paper beats rock your tasks to find and return a string value representing the winning move for b.

import java.util.*;
public class Question31 {

    public static String WinningMove(String str){
        if(str.contains("Rock")){
            return "Paper";
        }else if(str.contains("Paper")){
            return "Scissor";
        }else{
            return "Rock";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(WinningMove(str));
        sc.close();
    }
}
