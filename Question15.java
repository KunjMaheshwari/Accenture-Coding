//Implementation of queue using stack

import java.util.*;

public class Question15 {

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }


        //removing
        public static int remove(){
            return s1.pop();
        }

        //peek
        public static int peek(){
            return s1.peek();
        }
    }

    public static void main(String[] args) {

    }
}
