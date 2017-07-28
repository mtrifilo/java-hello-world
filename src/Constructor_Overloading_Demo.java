class Constructor_Overloading_Demo {
    int value1;
    int value2;

    Constructor_Overloading_Demo () {
        value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st Constructor");
    }

    Constructor_Overloading_Demo(int a) {
        value1 = a;
        System.out.println("Inside 2nd Constructor");
    }

    Constructor_Overloading_Demo(int a, int b) {
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");
    }

    public void display() {
        System.out.println("Value1 === " + value1);
        System.out.println("Value2 === " + value2);
    }

    public static void main(String args[]) {
        Constructor_Overloading_Demo d1 = new Constructor_Overloading_Demo();
        Constructor_Overloading_Demo d2 = new Constructor_Overloading_Demo(30);
        Constructor_Overloading_Demo d3 = new Constructor_Overloading_Demo(30, 40);

        d1.display();
        d2.display();
        d3.display();
    }

}