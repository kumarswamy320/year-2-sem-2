import java.util.Scanner;

class pos_or_neg{
   public static void main(String[] args) {

    Scanner ref=new Scanner(System.in);
      System.out.printf("enter the number:");
      var num1=ref.nextInt();
      if(num1>0){
        System.out.println("positive number");
      }
      else if(num1<0){
        System.out.println("negative number")  ;
    
    }
     else{
        System.out.println("zero number");

     }
      }
       

   }
