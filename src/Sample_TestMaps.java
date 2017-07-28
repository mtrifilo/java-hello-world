import java.util.HashMap;
import java.util.Map;

public class Sample_TestMaps {
    public static void main (String[] args) {
        Map<String, String> objMap = new HashMap<String, String>();

        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Prince", "85000");

        System.out.println("Elements of the map:");
        System.out.println(objMap);
    }
}