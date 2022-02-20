interface Shape{
    void draw();
}

interface Polygon{
    double getArea();
    double getPerimeter();
    boolean isPolygon();
}

class Line implements Shape{

    @Override
    public void draw() {
        System.out.println("I am a Line");
    }
    
}

class Triangle implements Shape,Polygon{
    int a;//base while calculating area
    int b;//height while calculating area
    int c;

    
    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (a*b)/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public boolean isPolygon() {
        return true;
    }

    @Override
    public void draw() {
        System.out.println("I am of Triangle shape");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
    
    
}

class Rectangle implements Shape,Polygon{
    int l;
    int b;

    
    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return l*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(l+b);
    }

    @Override
    public boolean isPolygon() {
        return true;
    }

    @Override
    public void draw() {
        System.out.println("I'am of rectangle shape");
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle [b=" + b + ", l=" + l + "]";
    }
    
    
}

public class InterfaceDriver{
    public static void main(String[] args) {
        Shape line = new Line();
        line.draw();

        Triangle triangle = new Triangle();
        triangle.a = 2;
        triangle.b = 3;
        triangle.c = 4;
        System.out.println(triangle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.l = 5;
        rectangle.b = 6;
        System.out.println(rectangle.getArea());
    }
}