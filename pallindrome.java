import java.util.*;
public class pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not a pallindrome");
                break;
            }
            start++;
            end--;
        }
        System.out.println("It is pallindrome");
        sc.close();
    }
}
