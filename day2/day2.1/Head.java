public class Head {
    private String colorhair;
    private String coloreye;

    public String getColorhair() {
        return colorhair;
    }

    public void setColorhair(String colorhair) {
        this.colorhair = colorhair;
    }

    public String getColoreye() {
        return coloreye;
    }

    public void setColoreye(String coloreye) {
        this.coloreye = coloreye;
    }

    public Head(String colorhair, String coloreye) {
        this.coloreye = coloreye;
        this.colorhair = colorhair;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Head{" +
                "colorhair='" + colorhair + '\'' +
                ", coloreye='" + coloreye + '\'' +
                '}';
    }
}
