import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){

        List<String> input = Arrays.asList("one","two","three","seven","nine","four");
        StringChecker checker = new ListExamples();
        List<String> output = Arrays.asList("one","two","nine","four");
        assertEquals(output, ListExamples.filter(input,checker));

    }

    @Test
    public void testMerge() {
        
        List<String> sort1 = Arrays.asList("a","b","c","f","g");
        List<String> sort2 = Arrays.asList ("d","l","n","o","z");
        List<String> expect = Arrays.asList("a","b","c","d","f","g","l","n","o","z");
        assertEquals(expect, ListExamples.merge(sort1,sort2));
    }

}