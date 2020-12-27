public class Prism extends Shape {
    public Prism(Key key) {
        super(key);
    }

    @Override
    void getDescription() {
        System.out.println("Hey, " +
                "I am Prism, I increase speed by " + this.key.getBehaviour());
    }
}
