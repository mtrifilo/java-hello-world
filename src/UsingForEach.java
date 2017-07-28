class UsingForEach {
    public static void main(String[] args) {
        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};

        System.out.println("Using a for loop:");

        // Iterating using a for loop
        for (int i = 0; i < arrData.length; i++) {
            System.out.println(arrData[i]);
        }

        System.out.println("\nUsing a Foreach loop:");

        // Iterating using a foreach loop
        for (String strTemp : arrData) {
            System.out.println(strTemp);
        }

    }
}