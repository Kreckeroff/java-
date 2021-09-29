public class Sofa extends Furniture{
    protected int articule = 1550321;
    protected double length;
    protected double height;
    protected double width;

    public Sofa(String material, double length, double height, double width) {
        super(material);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "material='" + material + '\'' +
                ", vendor code=" + articule +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
