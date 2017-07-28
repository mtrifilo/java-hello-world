class Constructor_Demo {
    int value1;
    int value2;

    Constructor_Demo() {
        value1 = 10;
        value2 = 20;
        System.out.println("Inside Constructor");
    }

    public void display() {
        System.out.println("Value1 === " + value1);
        System.out.println("Value2 === " + value2);
    }

    public static void main(String args[]) {
        Constructor_Demo d1 = new Constructor_Demo();
        d1.display();
    }

}