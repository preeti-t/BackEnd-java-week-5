/**
 * Streams filter and collect example.
 */

package streams_lambda.examples;

import java.util.Arrays;
import java.util.List;

public class Example5
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Alice", "bob", "Anna", "George", "Amelia");

        List<String> filtered = names.stream()
            .filter(name -> name.startsWith("A") || name.startsWith("a"))
            .toList();

        System.out.println(filtered);
    }
}
