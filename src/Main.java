public class Main {

    public static void main(String[] args) {
        int M = 19;
        int N = 19;
        Circle[] circles = new Circle[M];
        Cone[] cones = new Cone[N];

        for (int i=0; i<M;i++){
            int randomR = 1 + (int)(Math.random() * 5);
            circles[i] = new Circle(randomR);
            System.out.println("Окружность " + (i+1) + " С радиусом " + circles[i].getR() + " Имеет площадь: " + circles[i].getS() + " И длину окружности: " + circles[i].getL());
        }

        for (int i=0; i<N; i++){
            int randomR = 1 + (int)(Math.random() * 5);
            int randomH = 1 + (int)(Math.random() * 5);
            cones[i] = new Cone(randomR, randomH);
            System.out.println("Конус " + (i+1) + " С радиусом " + cones[i].getR() + " Высотой: " + cones[i].getH() + " Имеет площадь: " + cones[i].getS() + " И объем: " + cones[i].getV());
        }

        double sr=0;
        for (int i=0; i<M;i++){
            sr = sr + circles[i].getS();
        }
        sr = sr/M;
        int kol = 0;
        for (int i=0; i<M; i++){
            if (circles[i].getS() < sr) kol++;
        }
        System.out.println(kol + " окружностей с радиусом меньше среднего");

        double max = cones[0].getV();
        for (int i=1; i<N; i++){
            if (cones[i].getV() > max) {
                max = cones[i].getV();
            }
        }
        System.out.println("Наибольший объем конуса: " + max);

    }
}
