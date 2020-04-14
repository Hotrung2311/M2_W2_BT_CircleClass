package pack;

public class Cylinder extends Circle {
    double height;
    static int cylinderCounter;

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
    @Override
    public String toString(){
        return "Hình trụ " + cylinderCounter + " có: Bán kính đáy: " + getRadius()
                + ", Chiều cao: " + getHeight()
                + ", Màu: " + getColor()
                + ", Thể tích: " + getVolume();
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder(4.2, 7, "green");
        System.out.println(cy1.toString());
        //Circle c2 = new Circle();
        //System.out.println(c2.toString());
    }
}