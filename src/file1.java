// try-catch

//import java.io.*;
//
//class file1 {
//    public static void main(String[] args) {
//        try {
//            FileWriter file = new FileWriter("/Users/matt.trifilo/Java/hello-world/Data.txt");
//            file.write("bangarang");
//            file.close();
//        }
//        catch(IOException e) {
//            System.out.println(e);
//        }
//    }
//}

// Java Throws Syntax

import java.io.*;

class file1 {
    public static void main(String[] args) throws IOException{
        FileWriter file = new FileWriter("/Users/matt.trifilo/Java/hello-world/Data.txt");
        file.write("bangarang");
        file.close();
    }
}
