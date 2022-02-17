abstract class Shape{
    String name;
    double area;
    double perimeter;
    
    @Override
    public String toString() {
        return "Shape [area=" + area + ", name=" + name + ", perimeter=" + perimeter + "]";
    }
    public Shape(String name, int area, int perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    
    abstract double calculateArea();

    abstract double calculatePerimeter();

    abstract String draw();

}

class Rectangle extends Shape{
    int l;
    int b;

    Rectangle(int l,int b){
        super("Rectangle");
        this.l = l;
        this.b = b;
    }

    @Override
    double calculateArea() {
        area = l*b;
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 2*(l+b);
        return perimeter;
    }
    
    @Override
    public String toString() {
        return "Rectangle [b=" + b + ", l=" + l + "]";
    }

    @Override
    String draw() {
        return "Drawn Rectangle";
    }
    
}

class Square extends Shape{
    int a;
    
    public Square(String name, int area, int perimeter, int a) {
        super(name, area, perimeter);
        this.a = a;
    }

    @Override
    double calculateArea() {
        area = a*a;
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 4*a;
        return perimeter;
    }

    @Override
    String draw() {
        return "Drawn Square";
    }
}

class Circle extends Shape{
    int r;

    
    public Circle(String name, int area, int perimeter, int r) {
        super(name, area, perimeter);
        this.r = r;
    }

    @Override
    double calculateArea() {
        area = (3.14)*r;
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 2*(3.14)*r;
        return perimeter;
    }

    @Override
    String draw() {
        return "Drawn Circle";
    }
}



public class AbstractDriver {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.draw());

    }
}
