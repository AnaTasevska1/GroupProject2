package GroupProject2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    public void calculateArea(){
        System.out.println("calculate area of circle");
    }
    public void calculatePerimeter(){
        System.out.println("calculate perimeter of circle");
    }

}
class Square implements Shape{
    public void calculateArea(){
        System.out.println("calculate area of square");
    }
    public void calculatePerimeter(){
        System.out.println("calculate perimeter of square");
    }
}
class ShapeTester {
    public static void main(String[] args) {
        Shape[] sh = {new Circle(), new Square()};
        for (Shape sh1 : sh) {
            sh1.calculateArea();
            sh1.calculatePerimeter();
        }
    }
}

/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */
