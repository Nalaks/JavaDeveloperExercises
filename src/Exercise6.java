public class Exercise6 {
    public static void main(String[] args) {
        String[] monat = new String[6];

        monat[0] = "Mo  Di  Mi  Do  Fr  Sa  So";
        monat[1] = "             1   2   3   4";
        monat[2] = " 5   6   7   8   9  10  11";
        monat[3] = "12  13  14  15  16  17  18";
        monat[4] = "19  20  21  22  23  24  25";
        monat[5] = "26  27  28  29  30  31    ";

        for (int i = 0; i < monat.length; i++) {
            System.out.println(monat[i]);
        }
    }
}
