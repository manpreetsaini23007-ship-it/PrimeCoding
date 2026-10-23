import java.util.*;
public class employee_salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double basic = sc.nextDouble();

        double HRA_RATE = 0.20;
        double DA_RATE = 0.10;

        double HRA = basic * HRA_RATE;
        double DA = basic * DA_RATE;
        double Gross_salary = basic + HRA + DA;

        System.out.printf("HRA = %.2f%n" ,HRA);
        System.out.printf("DA = %.2f%n", DA);
        System.out.printf("Gross Salary = %.2f%n" ,Gross_salary);
        
        sc.close();
    }
}