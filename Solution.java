import java.util.*;

class Solution {
    public static void printMinString(String [] str){
        String minstr = str[0];
        for(int i = 1 ; i < str.length; ++i){
            if(str[i].length() < minstr.length()){
                minstr = str[i];
            }
        }
        System.out.println(minstr);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String sentence[]=new String[n];
        for(int i=0;i<n;i++)sentence[i]=sc.nextLine();
        Solution Obj= new Solution();
        Obj.printMinString(sentence);
    }
}
