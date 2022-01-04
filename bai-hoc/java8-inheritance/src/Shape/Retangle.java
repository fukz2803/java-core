package Shape;

public class Retangle extends Shape{
    private double a;
    private double b;

    public Retangle(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public String toString() {
        return
                "a= " + a +
                " b= " + b +
                " diện tích là: " + acreage()+
                " chu vi là: " + perimeter()
                ;
    }

    @Override
    public double acreage() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }
}
