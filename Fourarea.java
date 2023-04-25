import java.util.Scanner;
public class Fourarea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1)area of circle");
        System.out.println("2)area of rectangle");
        System.out.println("3)area of triangle");
        System.out.println("4)area of square");
        System.out.println("enter your choice:");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("enter radius:");
            double r=sc.nextDouble();
            double a1=3.14*r*r;
            System.out.println("area of circle:"+a1);
            break;
            case 2:
            System.out.println("enter length:");
            double l=sc.nextDouble();
            System.out.println("enter breath:");
            double b=sc.nextDouble();
            double a2=l*b;
            System.out.println("area of rectangle:"+a2);
            break;
            case 3:
            System.out.println("enter height:");
            double h=sc.nextDouble();
            System.out.println("enter base:");
            double base=sc.nextDouble();
            double a3=(h*base)/2;
            System.out.println("area of triangle:"+a3);
            break;
            case 4:
            System.out.println("enter length:");
            double ln=sc.nextDouble();
            double a4=ln*ln;
            System.out.println("area of square:"+a4);
            break;
            default:
            System.out.println("invalid input");
        }
    }
}