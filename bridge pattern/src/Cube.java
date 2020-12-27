public class Cube extends Shape {
    public Cube(Key key) {
        super(key);
    }

    @Override
    void getDescription() {
        System.out.println("Hey, I am cube, " +
                "   I increase power by " + this.key.getBehaviour());
    }
}
