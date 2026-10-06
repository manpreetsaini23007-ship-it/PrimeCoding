import java.util.*;
public class string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        sc.close();
    }
}
