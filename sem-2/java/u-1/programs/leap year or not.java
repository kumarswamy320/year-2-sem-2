import java.util.Scanner;

class leap_year {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter the year: ");

           var year=ref.nextInt();
            
             if(year%400==0){
                System.out.print("leap year");
  
    
             }
             else{
     
                   if(year%100==0){
                    System.out.print( " not leap year");
                   }
                   else{
  
                      if(year%4==0){
                        System.out.print("leap year");
                      }
                      else{
                        System.out.print(" not leap year");
                      }


                   }
                 
             }
       

    }
}
