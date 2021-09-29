public class SquareDish extends Dish{
    private int length;
    private String material;
    private String color;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public SquareDish(String material, String color,int length) {
        super(material, color);
        this.length = length;
        this.material = material;
        this.color = color;
        System.out.println(toString());

    }

    @Override
    public String toString () {
        return  "Dish{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' + "SquareDish{" +
                "length=" + length +
                '}';
    }
}
