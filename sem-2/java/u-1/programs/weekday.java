import java.util.*;
class p4{
    public static void main(String[] args) {
        
 
     Scanner ref=new Scanner(System.in);
    
     System.out.print("enter the number(range 1-7):");
     var num=ref.nextInt();
     if(num==1){
        System.out.println("MONDAY");
     }
     else if(num==2){
       System.out.println("TUESDAY");
     }
     else if(num==3){
        System.out.print("WEDNESDAY");

     }

     else if(num==4){
     
       System.out.print("THURSDAY");

    }
    else if(num==5){



         System.out.print("FRIDAY");

    }

    else if(num==6){
        System.out.print("SATURDAY");
    }
      else if(num==7){

        System.out.print("SUNDAY");

      }
      else {
        System.out.print("envalid number range");
      }


    }
}