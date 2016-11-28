public class Cone extends Circle {
    public double H;

    Cone(double rad, double height) {
        super(rad);
        H = height;
    }

    public double getS() {
        double l;
        l=Math.sqrt(Math.pow(H,2)+Math.pow(R,2));
        return ((Math.PI)*(Math.pow(R,2)))+((Math.PI)*R*l);
    }

    public double getL() {
        return (2*(Math.PI)*R);
    }

    public double getV() {
        return ((1.0/3.0)*(Math.PI)*(Math.pow(R,2))*H);
    }

    public double getH() {
        return H;
    }
}
