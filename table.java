import java.util.Scanner;
public class table{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        System.out.print("enter where to end table: ");
        int end = sc.nextInt();

        for(int i=1 ; i<=end ; i++){
            System.out.println(n + " * " + i + " = " +(n*i));
        }
        sc.close();
    }
}