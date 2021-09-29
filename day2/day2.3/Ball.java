public class Ball {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(double xDisp,double yDisp){
        x = xDisp + x;
        y = yDisp + y;
    }
    void setXYSpeed(double speed){
        move(2*speed,3*speed);
    }
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println(toString());
        setXYSpeed(1.5);
        System.out.println(toString());

    }


    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
