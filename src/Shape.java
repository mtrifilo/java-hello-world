abstract class Shape {
    final int b = 20;

    public void display() {
        System.out.println("This is display method");
    }

    abstract public void calculateArea(int length, int width);
}

class Rectangle extends Shape {
    int area;

    public void calculateArea(int length, int width) {
        area = length * width;
        System.out.println("area: " + area);
    }

    public static void main (String args[]) {
        Rectangle obj = new Rectangle();
        obj.display();
        obj.calculateArea(2, 2);
    }
}