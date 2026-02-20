import java.util.Scanner;
public class add{

    public static void main(String []args ){
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    //int c;
   

    System.out.println("enter 2 values to you have calculatr  an use symbol like *,_,+,/ ");
    a = sc.nextInt();
    String op = sc.next();
    b = sc.nextInt();
       switch (op){
        case "+":
            System.out.println(a+b);
        break;

        case "-":
            System.out.println(a-b);
        break;

        case"/":
        System.out.println(a/b);
        break;

        case "*":
            System.out.println(a*b);
         break;   

    }


    }
}
