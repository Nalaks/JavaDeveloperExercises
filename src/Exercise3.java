import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] passwordList = {"Passwort", "PASSWORT", "Password", "P@$$w0rd"};
        int count = 0;

        while (count < 3) {

            System.out.print("Please input password: ");
            String password = scanner.next();
            boolean pass = false;

            for (int i = 0; i < passwordList.length; i++) {
                if (passwordList[i].equals(password)) {
                    pass = true;
                    break;
                }
            }

            if (!pass) {
                count++;
                if (count != 3) {
                    System.out.println("Password is wrong. Please try again.");
                }
            } else {
                break;
            }


        }

        System.out.println();

        if (count >= 3) {
            System.out.println("Access denied.");
            System.exit(0);
        }

        System.out.print("Please input security level: ");
        int secLevel = scanner.nextInt();

        if (secLevel < 1 || secLevel > 3) {
            System.out.println();
            System.out.println("Access denied.");
            System.exit(0);
        }

        System.out.println();

        System.out.print("Please input your name: ");
        String name = scanner.next();

        System.out.println(name + ", you are allowed access to the data.");

    }
}
