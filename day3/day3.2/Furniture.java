abstract public class Furniture {
    protected String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Furniture(String material) {
        this.material = material;
    }
}
