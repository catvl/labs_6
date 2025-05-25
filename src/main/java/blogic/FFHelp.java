package blogic;

public class FFHelp {
    public static boolean isTriangle(double a, double b, double c) { //проверка на треугольник
        return c < a + b && b < c + a && a < c + b;
    }
    public static boolean isParallelogram(int alfa, int betta) {//проверка на параллелограм
        return alfa + betta == 180;
    }
    public static double triangleArea(double a, double b, double c) {//площадь треугольника
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static double rightTriangleArea(double a, double b) {//площадь прямоугольного треугольника
        return 0.5 * a * b;
    }
    public static double parallelogramArea(double a, double b, int alfa) {//площадь параллелограмма
        return a * b * Math.sin(alfa * Math.PI / 180);
    }
    public static double rectangleArea(double a, double b) {//площаль прямоугольника
        return a * b;
    }
}
