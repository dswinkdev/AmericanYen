import java.util.Scanner;

public class AmericanYen {

    // spacer
    public static void spacer() {
        System.out.println();
    }

    // intro method
    public static void americanYenIntro() {
        System.out.println("---------$--------");
        System.out.println("🇺🇸 American Yen 🇯🇵");
        System.out.println("---------$--------");
    }

    // main
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // declarations
        double usdAmount = 0.0;
        double yen = 149.02;

        // intro
        americanYenIntro();
        spacer();

        // usdAmount while loop
        while (!(usdAmount == -1)) {
            System.out.print("Press -1 to quit.");
            System.out.print("\nEnter US dollar amount for Yen conversion: $");
            usdAmount = scan.nextDouble();

            // American to Japanese conversion rate
            double convRate = usdAmount * yen;

            if (usdAmount == -1) {
                System.out.print("Thanks for stopping by! 👋");
                break;
            }

            System.out.println("---------$--------");
            System.out.printf("🇺🇸American Dollar: $%.2f", usdAmount);
            System.out.printf("\n🇯🇵Japanese Yen Dollar: ¥%.2f", convRate);
            System.out.println("\n---------$--------");
        }
        scan.close();
    }
}