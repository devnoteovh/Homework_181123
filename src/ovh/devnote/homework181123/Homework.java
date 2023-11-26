package ovh.devnote.homework181123;

import java.util.Deque;
import java.util.LinkedList;

public class Homework {
    public static int bunnyEars2(int bunnies) {
        if(bunnies==0){
            return 0;
        }else{
            int b=0;
            if(bunnies%2==0){
                b=3;
            }else{
                b=2;
            }
            return b+bunnyEars2(bunnies-1);
        }
    }

    public static int count7(int n) {
        if (n==0){
            return 0;
        }else{
            int b=0;
            if (n%10 == 7)
                b++;
            return b+count7(n/10);
        }
    }

    public static int countX(String str) {
        int n=0;
       if(str.length()==0){
           return 0;
       }else{
           if (str.charAt(str.length()-1)=='x'){
               n++;
           }
           n = n+countX(str.substring(0,str.length()-1));
       }
        return n;
    }

    public static String allStar(String str) {

            if( str.length()==1 || str.length()==0){
                return str;
            }
            else{
                char first = str.charAt(0);
                String rest = str.substring(1,str.length());
                String s =first+"*"+allStar(rest);
                return s;
            }

    }

    public static String toBinary(int decimal){
        if (decimal == 1 || decimal == 0){
            return String.valueOf(decimal%2);
        }else{
            int full = (int)decimal /2;
            int rest = (int)decimal % 2;
            String s = toBinary(full)+rest;
            return s;
        }
    }

    public static double geometricElement(int a,int q,int n){
        return  a * (Math.pow(q,(n-1)));
    }

    public static boolean checkBracket(String str){
        Deque<String> stack = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                stack.push("(");
            }else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static String repeatEnd(String str, int n) {
        int temp=n;
        String repeated="";
        while(n>0){
            repeated= repeated+str.substring(str.length()-temp);
            n--;
        }
        return repeated;
    }

    public static boolean xyzMiddle(String str) {

        //TODO: xyz can repeat!! Need to rewrite solution.
            String[] sses = str.split("xyz");
            return Math.abs(sses[0].length()-sses[1].length())<=1 ;
    }

    public static String mixString(String a, String b) {
        int shorterLength=0;
        boolean a_shorter=false;
        boolean both_size=false;
        if(a.length()<b.length()){
            shorterLength=a.length();
            a_shorter=true;
        }else if(a.length()>b.length() ){
            shorterLength = b.length();
            a_shorter = false;
        }
        else{
            shorterLength=a.length();
            both_size=true;
        }

        StringBuilder result= new StringBuilder();
        int i=0;

        while (i<shorterLength){
            result.append(a.charAt(i));
            result.append(b.charAt(i));
            i++;
        }
        if(a_shorter){
            result.append(b.substring(i));
        }else if(!both_size){
            result.append(a.substring(i));
        }
        return  result.toString();
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int minbig = Math.min(big, goal / 5);
        int remain = goal - (minbig * 5);
        return remain <= small;

    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    private static int fixTeen(int n){
        if(n<13 || n==15 || n==16 || n>19){
            return n;
        }else{
            return 0;
        }
    }

    public static int blackjack(int a, int b) {
            if(a>21 && b>21)
                return 0;
            else if (a>21){
                return b;
            }else if (b>21){
                return a;
            }
            return (21-a)<(21-b)?a:b;
    }

    public static int sumDigits(String str) {
        int sum=0;
        for (int i=0;i<str.length();i++){
            char c= str.charAt(i);
            sum+= Character.isDigit(c)?Integer.parseInt(""+c):0;
        }
        return sum;
    }

    public static int countTriple(String str) {
        int triplets=0;
        int counter=1;
        int i=1;
        while(i<str.length()){

            if(str.charAt(i-1)==str.charAt(i)) {
                counter++;
            }
            else{
                counter=1;
            }
            if (counter==3){
                triplets++;
                counter=1;
                i=i-1;
            }
            i++;
        }
        return triplets;
    }

    public static int makeChocolate(int small, int big, int goal) {
        int minbig = Math.min(big, goal / 5);
        int remain = goal - (minbig * 5);
        return remain <= small?remain:-1;
    }

    public static int countClumps(int[] arr) {
        int clumps=0;
        int counter=1;
        int i=1;
        while(i<arr.length){

            if(arr[i-1]==arr[i]) {
                counter++;
            }
            if(arr[i-1]!=arr[i] || i==arr.length-1){
                if(counter>=2){
                    clumps++;
                    counter=1;
                }
            }
            i++;
        }
        return clumps;
    }

    public static boolean canBalance(int[] nums) {
        int sumLeft=0;
        for (int i=0;i<nums.length;i++){
            sumLeft = sumLeft+nums[i];
            int sumRight=0;
            for(int j=nums.length-1;j>i;j--){
                sumRight=sumRight+nums[j];
            }
            if (sumLeft == sumRight)
                return true;
        }
        return false;
    }

}
