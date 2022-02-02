import com.example.numberrangesummarizer.Summarize;

import java.util.Collection;
import java.util.Scanner;

public class Impact_challenge_1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String numbers = myObj.nextLine();
        myObj.close();
        Summarize Str_summary = new Summarize();
        Collection<Integer> numbers_splinted = Str_summary.collect(numbers);
        String summary = Str_summary.summarizeCollection(numbers_splinted);
        System.out.println(summary);

    }
}
