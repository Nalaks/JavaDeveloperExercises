public class Animal {
    private String spezies;
    private String name;
    private int position;

    public Animal(String spezies, String name) {
        this.spezies = spezies;
        this.name = name;
    }

    public void move() {
        position++;
        if (position > 50) {
            position = 50;
        }
    }

    public void move(int positionsErhoehung) {
        position += positionsErhoehung;
        if (position > 50) {
            position = 50;
        }
    }

    public void resetPosition() {
        position = 0;
    }

    public void moveBackwards() {
        position--;
        if (position < 0) {
            resetPosition();
        }
    }

    public void moveBackwards(int positionsErniedrigung) {
        position -= positionsErniedrigung;
        if (position < 0) {
            resetPosition();
        }
    }

    @Override
    public String toString() {
//        String leerzeichen = "";
//        for (int i = 0; i < position; i++) {
//            leerzeichen += "...";
//        }
        return ("...").repeat(position) + name;
    }
}
