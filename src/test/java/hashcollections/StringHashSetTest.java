package hashcollections;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class StringHashSetTest {

   @Test

    public void sizeShouldReturnCountOfElementsInserted() {
       Set<String> set = new StringHashSet();
       set.add("Adam");
       set.add("Asia");
       set.add("Aleks");
       set.add("Rafał");
       set.add("Łukasz");
       set.add("Adrian");

       assertEquals(6,set.size());



    }
}