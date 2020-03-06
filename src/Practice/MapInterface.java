package Practice;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {


        Map<String,Integer> scoreMap= new HashMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);

        System.out.println("scoreMap = " + scoreMap);
        System.out.println("scoreMap.size() = " + scoreMap.size());
        System.out.println("Mary score: = " + scoreMap.get("Mary"));
        System.out.println("Adam score: = " + scoreMap.get("Adam"));
        System.out.println("Is map empty = " + scoreMap.isEmpty());

        System.out.println("=========================================");

        Map<String,Integer> scoreMap2= new HashMap<>();
        scoreMap2.put("Diana",80);
        scoreMap2.put("Alex",92);
        scoreMap2.put("Beian",80);

        System.out.println("scoreMap2 = " + scoreMap2);

        scoreMap.putAll(scoreMap2);
        System.out.println("scoreMap = " + scoreMap);

        scoreMap.putIfAbsent("Mary II",99);
        System.out.println("scoreMap = " + scoreMap);

        System.out.println("Replacing Mary's score = " + scoreMap.replace("Mary", 100, 86));
        System.out.println("scoreMap = " + scoreMap);


        Set<String> keys= scoreMap.keySet();
        System.out.println("keys = " + keys);
        
        keys.remove("Adam");
        System.out.println("keys = " + keys);
        System.out.println("scoreMap = " + scoreMap);

        for (String eachKey : keys) {

            System.out.println("eachKey = " + eachKey +" value: "+scoreMap.get(eachKey));

        }


        System.out.println("=============================================================");
        Set<Map.Entry<String,Integer>> allEntries= scoreMap.entrySet();
        for (Map.Entry<String, Integer> eachEntry : allEntries) {
//            System.out.println("eachEntry = " + eachEntry);
            System.out.println("key: "+eachEntry.getKey()+" value: "+eachEntry.getValue());

            System.out.println("=============================================================");

            SortedMap<String,Integer> scoreMap3= new TreeMap<>();
            scoreMap3.put("Taha",90);
            scoreMap3.put("Kaan",92);
            scoreMap3.put("Jenny",100);
            scoreMap3.put("Jess",80);
            scoreMap3.put("Bunny",60);
            scoreMap3.put("Funny",100);
            System.out.println("scoreMap3 = " + scoreMap3);

            System.out.println("scoreMap3.firstKey() = " + scoreMap3.firstKey());
            System.out.println("scoreMap3.lastKey() = " + scoreMap3.lastKey());

            System.out.println("scoreMap3.subMap(\"Bunny\",\"Jenny\") = " + scoreMap3.subMap("Bunny", "Jenny"));


        }
    }
}
