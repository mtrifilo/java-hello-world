class ArrayDemo {
    public static void main(String args[]) {
        int array[] = new int[7];

        for (int i = 0; i < 7; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("Length of Array = " + array.length);
    }
}