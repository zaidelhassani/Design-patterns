public class Sphere extends Shape {
    public Sphere(Key key) {
        super(key);
    }

    @Override
    void getDescription() {
        System.out.println("Hey, I am shpere, " +
                "I increase health by " + this.key.getBehaviour());
    }
}
