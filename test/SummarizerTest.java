import com.example.numberrangesummarizer.NumberRangeSummarizer;
import com.example.numberrangesummarizer.Summarize;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SummarizerTest {



    @Test
    @DisplayName("All Sequential")
    public void summarizeCollection_AllSequential(){
        Summarize test_subject = new Summarize();

        Collection<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);

        assertEquals("1-10",test_subject.summarizeCollection(input));
    }
    @Test
    @DisplayName("Not Sequential")
    public void summarizeCollection_NotSequential(){
        Summarize test_subject = new Summarize();
        Collection<Integer> input = List.of(1,3,5,7,9,11,13,26,100);

        assertEquals("1, 3, 5, 7, 9, 11, 13, 26, 100", test_subject.summarizeCollection(input));
    }
    @Test
    @DisplayName("Random Test")
    public void summarizeCollection_randomTest(){
        Summarize test_subject = new Summarize();
        Collection<Integer> input = List.of(1,2,4,7,8,10,15,20,21,22);
        assertEquals("1-2, 4, 7-8, 10, 15, 20-22",test_subject.summarizeCollection(input));
    }
    


    @Test
    @DisplayName("Should Collect Numbers")
    public void ShoudCollectNumbers(){
        Summarize test_subject = new Summarize();
        String input = "1,2,3,6,8,9,24,64";
        String[] str_split = input.split(",");
        test_subject.collect(input).toArray();
        assertEquals(str_split.length, test_subject.collect(input).size());
    }
}
