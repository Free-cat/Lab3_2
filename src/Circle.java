public class Circle {
    public double R;

    Circle (double rad) {
        R = rad;
    }

    public double getR() {
        return R;
    }

    public double getS() {
        return (Math.PI)*(Math.pow(R,2));
    }

    public double getL() {
        return (2*(Math.PI)*R);
    }
}
