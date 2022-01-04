package Shape;

public class Square extends Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return
                "a= " + a +
                " diện tích là: " + acreage()+
                " chu vi là: " + perimeter()
                ;
    }

    @Override
    public double acreage() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return a*4;
    }
}
