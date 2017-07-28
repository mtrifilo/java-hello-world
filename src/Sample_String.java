public class Sample_String {
    public static void main(String[] args) {
        String str_Sample = "RockStar";

        // Length of a string
        System.out.println("Length of a String: " + str_Sample.length());

        // Character at a given index
        System.out.println("Character at position 5: " + str_Sample.charAt(5));

        // Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));

        // Compare strings - case sensitive
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));

        // Compare strings - ignore case
        System.out.println("Compare To 'ROCKSTAR' (case ignored): " +  str_Sample.compareToIgnoreCase("ROCKSTAR"));

        // Check if a string contains a sequence of chars
        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));

        // Confirm if a string ends with a particular suffix
        System.out.println("Ends with character 'r'" + str_Sample.endsWith("r"));

        // Convert to lower case
        System.out.println("Convert to lowercase: " + str_Sample.toLowerCase());

        // Convert to upper case
        System.out.println("Convert to uppercase: " + str_Sample.toUpperCase());
    }
}