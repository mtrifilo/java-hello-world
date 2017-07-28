public class Super_Test {
    public static void main(String args[]) {
        Super_X x = new Super_X();
        Super_Y y = new Super_Y();
        y.m2();
        x.m1();
        y.m1();
        // x = y;
        x.m1();
        y.b = 10;
        x.b = 10;
        x.m1();
    }
}

class Super_X {
    private int a;
    int b;
    public void m1() {
        System.out.println("This is method m1 of class X");
        System.out.println("This is 'b' in m1 of class X: " + b);
    }
}

class Super_Y extends Super_X {
    int c;
    public void m1() {
        System.out.println("This is method m1 of class Y");
    }
    public void m2() {
        super.m1();
        System.out.println("This is method m2 of class Y");
    }
}