public class FurnitureShop {
    protected Furniture furniture;
    protected int count;
    protected int price;


    public FurnitureShop(Furniture furniture, int count, int price) {
        this.furniture = furniture;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        if (count > 0) {
            return "FurnitureShop{" +
                    furniture +
                    ", count=" + count +
                    ", price=" + price +
                    '}';
        } else
            return "Нет в наличии! " + furniture;
    }
}
