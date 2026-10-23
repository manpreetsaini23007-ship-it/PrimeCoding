import java.util.*;
public class sum_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        System.out.print("sum: " +sum);
        sc.close();
    }
}
