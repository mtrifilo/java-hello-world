public class Arrays {

    private static int intArray[] = new int[10];

    public static void main(String []args) {

        for (int i = 0; i < 10; i++) {
            intArray[i] = i;
            System.out.println("current i: " + intArray[i]);
        }

        System.out.println("intArray: " + intArray);
    }
}