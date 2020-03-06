package Map;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {


        Map<String,Double> employees= new HashMap<>();
        //put;
        employees.put("Taha",100000.0);
        employees.put("Kaan",200000.0);
        System.out.println("employees = " + employees);

        double salary=employees.get("Kaan");
        System.out.println("salary = " + salary);

        employees.remove("Taha");
        System.out.println("employees = " + employees);

        System.out.println("employees.size() = " + employees.size());

        System.out.println("employees.containsKey(\"General\") = " + employees.containsKey("General"));

        System.out.println("employees.containsValue(1000000) = " + employees.containsValue(1000000));

        Set<String> str=employees.keySet();
        System.out.println("str = " + str);

        Map<String,Integer> map1= new LinkedHashMap<>();
        map1.put("A",100);
        map1.put("B",10);
        map1.put("C",9);
        map1.put("D",8);
        System.out.println("map1 = " + map1);


        List<String> list= new ArrayList<>(Arrays.asList("Taha","Taha","Ahmet","Kaan","Betul"));
        list.removeIf(each -> each.contains("Taha"));
        System.out.println("list = " + list);



    }
}
