/**
 * Grouping and counting with streams.
 */

package streams_lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example6
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("ant", "table", "car", "street", "dog", "plane", "cup");

        Map<Integer, Long> countsByLength = words.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(countsByLength);
    }
}
