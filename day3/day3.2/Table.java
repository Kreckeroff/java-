public class Table extends Furniture {
    protected int articule = 1049403;
    protected double length;
    protected double height;
    protected double width;

    public Table(String material, double length, double height, double width) {
        super(material);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", vendor code=" + articule +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
