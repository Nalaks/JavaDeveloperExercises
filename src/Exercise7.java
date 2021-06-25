public class Exercise7 {
    public static void main(String[] args) {
        Geraete printer = new Geraete("Printer ENVY 455", "HP", 2018, 380);

        System.out.println(printer);
        printer.wertAbschreiben();
        System.out.println(printer);
    }
}
