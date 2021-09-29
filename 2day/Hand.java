public class Hand {
    private String nail;

    public String getNail() {
        return nail;
    }

    public void setNail(String nail) {
        this.nail = nail;
    }

    public Hand(String nail) {
        this.nail = nail;
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return "Hand{" +
                "nail='" + nail + '\'' +
                '}';
    }
}
