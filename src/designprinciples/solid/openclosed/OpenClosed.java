package designprinciples.solid.openclosed;

public class OpenClosed {

    /**
     * - open closed principle states that the
     * software entities (classes, modules, functions, etc)
     * should be OPEN for EXTENSION but CLOSED for MODIFICATION
     *
     * business rule
     * - if we want to calculate the area for other shapes,
     * let's say, for Triangle, I will modificate my logic everytime
     * wich can lead to bugs related to modification of a code that
     * has dependencies
     * - we solve this by using abstraction and polymorphism
     *
    */
    public static void main(String[] args) {

        AreaCalculator rectangleArea = new AreaCalculator(new Rectangle(20D, 10D));
        rectangleArea.calculate();

        AreaCalculator circleArea = new AreaCalculator(new Circle(20D));
        circleArea.calculate();
    }
}

class AreaCalculator {

    private Shape shape;

    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

class Rectangle implements Shape {
    public Double height;
    public Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

class Circle implements Shape {
    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}
