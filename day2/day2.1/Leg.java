public class Leg {
    private String color;
    private int count;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Leg(String color, int count) {
        this.color = color;
        this.count = count;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Leg{" +
                "color='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}
