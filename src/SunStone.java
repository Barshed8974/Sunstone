import java.util.Scanner;

public class SunStone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Income");
        double income=sc.nextDouble();
        double tax= calculateTax(income);
        System.out.println("Your Tax Amount : "+tax);
        System.out.println("Amount After Tax Deduction : "+(income-tax));
    }

    private static double calculateTax(double income) {
        double tax=0;
        if (income>150000)
        {
            tax+=(income-150000)*3/10;
            income=150000;
        }
        if (income>60000)
        {
            tax+=(income-60000)*2/10;
            income=60000;
        }
        if (income>50000)
        {
            tax+=(income-50000)/10;
        }
        return tax;
    }
}
