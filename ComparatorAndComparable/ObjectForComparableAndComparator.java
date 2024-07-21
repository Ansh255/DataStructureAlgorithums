import java.util.ArrayList;

import java.util.Collections;

public class ObjectForComparableAndComparator {
    public static void main(String[] args) {
        ArrayList<emp> emp1 = new ArrayList<>();
        emp1.add(new emp(6, "Shyam"));
        emp1.add(new emp(1, "Krishna"));
        emp1.add(new emp(4, "naitik"));
        emp1.add(new emp(2, "Ansh"));

        // comparable
        System.out.println(emp1);
        Collections.sort(emp1);
        System.out.println(emp1);

        //COMPARATOR using ID 
        ArrayList<ComparatorClass> emp2 = new ArrayList<>();
        emp2.add(new ComparatorClass(6, "Shyam"));
        emp2.add(new ComparatorClass(1, "Krishna"));
        emp2.add(new ComparatorClass(4, "naitik"));
        emp2.add(new ComparatorClass(2, "Ansh"));
        System.out.println(emp2);
        Collections.sort(emp2,new IdWiseComparator());
        System.out.println(emp2);


        // using Name now comparator
        Collections.sort(emp2,new NameWiseComparator());
        System.out.println(emp2);
        
    }
}
