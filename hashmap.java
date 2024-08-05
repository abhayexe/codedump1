import java.util.*;
public class hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> mapid = new HashMap<>();
        mapid.put("Abhay", 696969);
        mapid.put("Seela", 27917);
        mapid.put("Djanko", 7119);

        System.out.println(mapid);

        mapid.replace("Seela", null);

        System.out.println(mapid);

        mapid.remove("Abhay");
        System.out.println(mapid);
    }
    
}
