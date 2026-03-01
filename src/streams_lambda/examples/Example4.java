/**
 * Streams map and sum example.
 */

package streams_lambda.examples;

import java.util.Arrays;
import java.util.List;

public class Example4
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        int sumOfSquares = numbers.stream()
            .mapToInt(n -> n * n)
            .sum();

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
