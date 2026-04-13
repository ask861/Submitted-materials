package week2_xu_mingcheng.practice1;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void printx() {
        System.out.println("正方形の辺の長さ: " + height +
                "、面積: " + getArea() +
                "、周長: " + getPerimeter());
    }
}