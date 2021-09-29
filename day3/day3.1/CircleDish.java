public class CircleDish extends Dish{
    private double radius;
    private String material;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CircleDish(String material, String color, double radius) {
        super(material, color);
        this.radius = radius;
        this.material = material;
        this.color = color;
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Сircle{" +
                "radius=" + radius +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
