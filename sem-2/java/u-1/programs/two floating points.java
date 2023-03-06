import java.util.Scanner;

// Program that reads in two floating-point numbers and tests whether they are the same up to three decimal plac

class p6{
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.print("enter first number: ");

        float num1=ref.nextFloat();
     

        System.out.print("enter second number: ");
        float num2=ref.nextFloat();
        if(num1==num2){
            System.out.print("both numbers are the same");

        }
        else{
            System.out.print("both numbers are not the same");

        }


   
        

   

    }
}