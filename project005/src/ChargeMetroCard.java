import java.util.Scanner;

// Pascal Case
public class ChargeMetroCard {
    private static int accountBalance = 5;
    private static final Scanner scan = new Scanner(System.in);

    public static void showAccountBalance() {
        System.out.printf("you have %d$ dollars on your account\n", accountBalance);
    }

    public static void main(String[] args) {

        //startChargeProgram();
        chargeCardProgram();

    }

    private static void startChargeProgram() {
        System.out.println("First slide your card!! and press any key");
        try {
             System.in.read();
        } catch (Exception e) {
            System.err.println("Error when enter to program ===> " + e.getMessage());
            //startChargeProgram();
            chargeCardProgram();
        }
    }
    public static void chargeCardProgram() {
        startChargeProgram();
        System.out.println("Welcome to ATM  card \n" +
                "Choose your Option [1 to 3] ?\n" +
                "1- charge your card.\n" +
                "2- see your account.\n" +
                "3- Exit Program");
        int operation = scan.nextInt();

        switch (operation) {
            case 1:
                charge();
                break;
            case 2:
                showAccountBalance();
                break;
            case 3:
                System.out.println("good bye ........");
                System.exit(0);
            default:
                System.out.println("Error system");
                chargeCardProgram();
                break;
        }
        chargeCardProgram();
    }

    public static void charge() {
        System.out.println(" How many dollars want to charge?[1 to 4] \n" +
                " 1 = 1$\n" +
                " 2 = 2$\n" +
                " 3 = 5$\n" +
                " 4 = 10$");
        int chargeMoneySelect = scan.nextInt();
        int chargeMoneyValue;
        switch (chargeMoneySelect) {
            case 1:
                chargeMoneyValue = 1;
                System.out.printf("you charge %d$ , Now your account %d$%n", chargeMoneyValue, (accountBalance += chargeMoneyValue));
                break;
            case 2:
                chargeMoneyValue = 2;
                System.out.printf("you charge %d$ , Now your account %d$%n", chargeMoneyValue, (accountBalance += chargeMoneyValue));
                break;
            case 3:
                chargeMoneyValue = 5;
                System.out.printf("you charge %d$ , Now your account %d$%n", chargeMoneyValue, (accountBalance += chargeMoneyValue));
                break;
            case 4:
                chargeMoneyValue = 10;
                System.out.printf("you charge %d$ , Now your account %d$%n", chargeMoneyValue, (accountBalance += chargeMoneyValue));
                break;
            default:
                System.out.println("invalid your Money Item\nthis money don't define this system");
                break;
        }
    }
}