import java.awt.*;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "drawing a rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return "drawing a line";
    }
}class Cube5 extends Shape5 {
    @Override
    public String draw() {

        return "drawing a cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {
    public static void main(String[] args) {
        Shape5 rectangleObj= new Rectangle5();
        Shape5 lineObj=new Line5();
        Shape5 cubeObj=new Cube5();
        System.out.println(rectangleObj.draw());
        System.out.println(lineObj.draw());
        System.out.println(cubeObj.draw());
    }
}
