import java.util.Comparator;

public class IdWiseComparator implements Comparator<ComparatorClass>{

    @Override
    public int compare(ComparatorClass o1, ComparatorClass o2) {
        return o1.getId() - o2.getId(); 
    }
    
}
