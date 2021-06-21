public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("*".repeat(9));
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print("*");
                    System.out.print(" ".repeat(3));
                }
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println("*".repeat(9));
    }

}
