import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double input1= scanner.nextDouble();
        boolean state=input1>1000;
        double kdv=state?0.08:0.18;
        double total=input1+(input1*kdv);
        System.out.println(total);

    }
}
