import java.util.Comparator;

public class NameWiseComparator implements Comparator<ComparatorClass>{

    @Override
    public int compare(ComparatorClass o1, ComparatorClass o2) {
      return o1.getName().compareTo(o2.getName());
    }
    
}
