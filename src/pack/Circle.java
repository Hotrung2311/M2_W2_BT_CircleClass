package pack;

public class Circle {
    private double radius;
    private String color;
    static int counter;

    public Circle(){
        counter++;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        counter++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public String toString(){
        return "Hình tròn " + counter + " có: Bán kính: " + getRadius()
                + ", Màu: " + getColor()
                + ", Diện tích: " + getArea();
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle(4.2, "green");
        System.out.println(c1.toString());
        Circle c2 = new Circle();
        System.out.println(c2.toString());
    }
}
