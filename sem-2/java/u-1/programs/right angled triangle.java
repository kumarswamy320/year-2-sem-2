// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class p4 {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
                System.out.print("ENTER THE NO OF ROWS:");
         var rows=ref.nextInt();
         for(var i=1;i<=rows;i++ ){
             for(var j=1;j<=i;j++){
                 System.out.print(j+" ");
             }
                     System.out.println();
         }
 
         
    }
}