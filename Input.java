import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //Integer  value
        char ch = sc.next().charAt(0); // char for a letter beacuse of index value is 0
        Float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println("Number :"+num);
        System.out.println("char :"+ch);
        System.out.println("Float :"+f);
        System.out.println("double :"+d);
    }
}
