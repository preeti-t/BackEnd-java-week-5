/**
 * Lambda comparator example.
 */

package streams_lambda.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 2, 9, 4, 1, 8));
        numbers.sort((a, b) -> Integer.compare(b, a));

        System.out.println(numbers);
    }
}
