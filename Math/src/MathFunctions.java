import java.util.Scanner;
public class MathFunctions {
    static double pi=3.14159265359;
    static double e=2.71828182846;

    static void Doira_yuzi(double radius){
        double yuzi=pi*Math.pow(radius,2);
        System.out.println("doirani yuzi");
        System.out.println(yuzi);
    }

    static void pow(double a){
        System.out.println("e ning darajasi");
        double pow =Math.pow(e,a);
        System.out.println(pow);
    }

    static void S(int a,int b,int c){
        int s=(a+b+c)/2;
        double A=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("uchburchakni yuzi");
        System.out.println(A);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doira radiusini kiriting");
        double radius=scanner.nextDouble();
        Doira_yuzi(radius);
        System.out.println("e ni darajasini kiritng");
        double d=scanner.nextDouble();
        pow(d);
        System.out.println("uchburchakni tomonlarini kiriting");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        S(a,b,c);

    }
}
