import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.print("enter the number:");
        var a=ref.nextInt();
          for(int i=1;i<=20;i++){
            System.out.println(a+"x"+i+"="+(a*i));


    }
}
}