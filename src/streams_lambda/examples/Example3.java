/**
 * BiFunction example.
 */

package streams_lambda.examples;

import java.util.function.BiFunction;

public class Example3
{
    public static void main(String[] args)
    {
        // Pick the larger of two integers using a BiFunction.
        BiFunction<Integer, Integer, Integer> maxValue = (a, b) -> a >= b ? a : b;
        int result = maxValue.apply(12, 7);

        // Print the computed maximum value.
        System.out.println("Max: " + result);
    }
}
