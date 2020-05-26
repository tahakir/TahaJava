package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {

        Predicate<Integer> remove100=p->p==100;

        List<Integer> list1= new ArrayList<>(Arrays.asList(100,1000,100,100,100,100));
        
        list1.removeIf(remove100);
        System.out.println("list1 = " + list1);


        List<Integer> list2= new ArrayList<>(Arrays.asList(100,200,300,400,500,600));

        Predicate<Integer> removeGreaterThan300=p->p>300;
        list2.removeIf(removeGreaterThan300);
        System.out.println("list2 = " + list2);

        List<Integer> list3= new ArrayList<>(Arrays.asList(100,200,300,400,500,600));

        list3.removeIf(Taha->Taha<300);
        System.out.println("list3 = " + list3);

        //remove all the names Ahmed
        List<String> list4= new ArrayList<>(Arrays.asList("Ahmed","Ali","Ahmed","Mehmet","Ahmed","Taha"));
        list4.removeIf(RemoveAhmed->RemoveAhmed.equals("Ahmed"));
        System.out.println("list4 = " + list4);


        //remove all the names endsWith "et"
        List<String> list5= new ArrayList<>(Arrays.asList("Ahmet","Ali","Ahmet","Mehmet","Ahmet","Taha","Halet"));
        list5.removeIf(et->et.endsWith("et"));
        System.out.println("list5 = " + list5);


        List<String> l1= new ArrayList<>();
        l1.addAll(Arrays.asList("Muhtar","Mahmut","Ahmet","Taha"));

        List<String> l2= new ArrayList<>();

        l1.forEach(a->{if (a.startsWith("M")){l2.add(a);}});
        
        l1.removeIf(m->m.startsWith("M"));

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("\tMap\n"+"\\Fun\\");

    }
}
