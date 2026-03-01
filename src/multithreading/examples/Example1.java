/**
 * Basic thread example.
 */

package multithreading.examples;

public class Example1
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable task = () ->
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        };

        Thread worker = new Thread(task, "Worker-1");
        worker.start();
        worker.join();

        System.out.println("Main complete.");
    }
}
