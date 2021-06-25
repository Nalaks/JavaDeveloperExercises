public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(fakultieren(4));
        System.out.println(fakultieren(6));

        System.out.println(fakultieren2(4));
        System.out.println(fakultieren2(6));
    }

    public static int fakultieren(int zahl) {
        if (zahl == 1) {
            return zahl;
        }
        return zahl * fakultieren(--zahl);
    }

    public static int fakultieren2(int zahl) {
        int fakultiert = 1;
        for (int i = zahl; i > 1; i--) {
            fakultiert *= zahl;
            zahl--;
        }
        return fakultiert;
    }
}
