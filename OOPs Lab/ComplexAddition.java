import java.util.Scanner;
public class ComplexAddition{
    public static void main(String args[]){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in)
    ;
    System.out.print("Enter real and imaginary part of first complex number:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.print("Enter real and imaginary part of second complex number:");
    c=sc.nextInt();
    d=sc.nextInt();
    int real=a+c;
    int imaginary=b+d;
    System.out.println("Sum="+real+"+i"+imaginary);
    }
}