package Shape;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return
                "a= " + a +
                " b= "   +b +
                " c= "   +c +
                " h=" + h +
                " diện tích là: " + acreage() +
                " chu vi là: " + perimeter()
                ;
    }

    @Override
    public double acreage(){
        return (a+h)/2;
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
