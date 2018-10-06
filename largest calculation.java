import java.util.*;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    a=sc.nextInt();
    System.out.println("enter the second number");
    b=sc.nextInt();
    System.out.println("enter the third number");
    c=sc.nextInt();
    if(a>b && a>c)
    System.out.println("the largest number"+a);
    else if(b>a && b>c)
    System.out.println("the largest number"+b);
    else
    System.out.println("the largest number"+c);
  }
}