import java.util.*;
public class odd_even_sort{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int temp[] = new int[n];

        System.out.print("enter elements: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 == 0){
                temp[k] = arr[i];
                k++;
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 != 0){
                temp[k] = arr[i];
                k++;
            }
        }

        

        for(int i = 0 ; i < n ; i++){
            System.out.print(temp[i]+ " ");
        }
        sc.close();
    }
}