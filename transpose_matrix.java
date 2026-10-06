import java.util.*;
public class transpose_matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of matrix: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("enter elements: ");

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("transpose: ");

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                System.out.println(arr[j][i]+ " ");
            }
            System.out.println();
        }

        boolean symmetric = true;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(arr[i][j] != arr[j][i]){
                    symmetric = false;
                    break;
                }
            }
        }

        if(symmetric){
            System.out.println("Symmetric");
        }else{
            System.out.println("not symmetric");
        }

        sc.close();
    }
}