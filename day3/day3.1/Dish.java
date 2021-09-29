abstract public class Dish {
    private String material;
    private String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
