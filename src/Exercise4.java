public class Exercise4 {
    public static void main(String[] args) {
        Animal pezi = new Animal("bär", "pezi");

        System.out.println(pezi);
        pezi.move();
        System.out.println(pezi);
        pezi.move(10);
        System.out.println(pezi);
        pezi.moveBackwards(5);
        System.out.println(pezi);
    }
}
