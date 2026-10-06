import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("enter operation (+, -, *, /): ");
        int choice = sc.next().charAt(0);


        switch(choice){
            case '+':
                System.out.println("sum = " +(a+b));
                break;
             case '-':
                System.out.println("difference = " +(a-b));
                break;
             case '*':
                System.out.println("product = " +(a*b));
                break;
             case '/':
                if(b<0){
                    System.out.println("divide = " +(a/b));
                    break;
                }else{
                    System.out.println("Can't divide by zero ");
                }
            default:
                System.out.println("ERROR!! ");
        }
        sc.close();
    }
}
