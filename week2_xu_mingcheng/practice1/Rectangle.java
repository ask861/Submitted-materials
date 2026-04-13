package week2_xu_mingcheng.practice1;

public class Rectangle implements Printx {

    protected double height;
    protected double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public void printx() {
        System.out.println("長方形の高さ: " + height +
                "、幅: " + width +
                "、面積: " + getArea() +
                "、周長: " + getPerimeter());
    }
}