// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;
class p4 {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
     System.out.print("enter the first value:");  
   int a=ref.nextInt();
    System.out.print("enter the second value:");
     int b=ref.nextInt();
System.out.print("enter the third value:");

    int c=ref.nextInt();
    //cheking a is greater than

    if(a>b){

      if(a>c){
     System.out.println("A is greater than  B and C "); 
       }
}
  //checking b is greayer than 
    if(b>a){

      if(b>c){
     System.out.println("B is greater than  A and C "); 
       }



}
  //checking c is greayer than 
    
     if(c>a){

      if(c>b){
     System.out.println("C is greater than  A and B "); 
       }



}
    }
}