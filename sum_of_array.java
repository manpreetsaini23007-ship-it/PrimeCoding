import java.util.*;
class sum_of_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

         int sum = 0;

        System.out.println("enter the elements: ");
        for(int i = 0; i < n; i++){
             arr[i] = sc.nextInt();
            sum += arr[i];   
        }

        double avg = (double) sum / arr.length;

        System.out.println("sum of array : "+sum);
        System.out.println("average of array : "+avg);
        sc.close();
    }
}