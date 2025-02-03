import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=50){
            double bill = 0.50*a;
            System.out.println(bill);
        }
        else if(a<=100){
            double bill = 0.75*a;
            System.out.println(bill);
        }
        else if(a<=250)
        {
            double bill = 0.*90*a;
            System.out.println(bill);

        }
    }
}
