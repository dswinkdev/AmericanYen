import java.util.Scanner;
import java.text.DecimalFormat;

public class AmericanYen {

    public static void space(){
        System.out.println();
    }

    public static void AmericanYen(){
        System.out.println("---------$--------");
        System.out.println("🇺🇸 American Yen 🇯🇵");
        System.out.println("---------$--------");
    }

    // main
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.00");

        double usdAmount = 0.0;
        double yen = 149.02;

        AmericanYen();
        space();

        while (!(usdAmount == -1)) {
            System.out.print("Press -1 to quit.");
            System.out.print("\nEnter US dollar amount for Japanese Yen conversion: $");
            usdAmount = scan.nextDouble();

            double convRate = usdAmount * yen;

            System.out.println("---------$--------");
            System.out.printf("🇺🇸American Dollar: $%.2f", usdAmount);
            System.out.println("\n🇯🇵Japanese Yen Dollar: ¥" + df.format(convRate));
            System.out.println("---------$--------");

        } if (usdAmount == -1) {
            System.out.print("You've exited the program.");
            scan.close();
        }
    }
}
