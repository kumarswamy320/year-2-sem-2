import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        System.out.println("give the input as ax^2+bx+c=0");

        Scanner ref=new Scanner(System.in);
        System.out.print("enter the a value:");
        var a=ref.nextInt();
        System.out.print("enter the b value:");
        var b=ref.nextInt();
        System.out.print("enter the c value:");
        var c=ref.nextInt();
        var d=b*b-4*a*c;
        if(d>=0){
            var sol1=(-b+(Math.sqrt(b*b-4*a*c)))/2*a;
            var sol2=(-b-(Math.sqrt(b*b-4*a*c)))/2*a;
            System.out.println("the roots are "+(int)sol1+ "and "+(int)sol2);
        }
        else if(d==0){
            var sol1=-b/2*a;
            var sol2=-b/2*a;
            System.out.println("the roots are "+sol1+"and "+sol2);
        }
        else {
            System.out.println("the roots are real");
        }
    }
}