/**
 * Lambda + Predicate example.
 */

package streams_lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example1
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("lamp", "window", "tree", "mountain", "road", "cloud");
        Predicate<String> lengthAtLeastFive = word -> word.length() >= 5;

        List<String> filtered = words.stream()
            .filter(lengthAtLeastFive)
            .toList();

        System.out.println(filtered);
    }
}
