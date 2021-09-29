public class Armchair extends Furniture{
    protected int articule = 1123156;
    protected double length;
    protected double height;
    protected double width;

    public Armchair(String material, double length, double height, double width) {
        super(material);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Armchair{" +"material='" + material +"' " +
                "vendor code=" + articule +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                "}";
    }
}
