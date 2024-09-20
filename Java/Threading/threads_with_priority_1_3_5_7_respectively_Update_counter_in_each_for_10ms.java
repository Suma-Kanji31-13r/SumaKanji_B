package Threading;

public class threads_with_priority_1_3_5_7_respectively_Update_counter_in_each_for_10ms implements Runnable{
    private int count = 0;
    private final long duration = 10; // milliseconds
    public void run() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < duration) {
            count++; }
        System.out.println(Thread.currentThread().getName() + " final count: " + count); }
    public static void main(String[] args) {
        int[] priorities = {1, 3, 5, 7};
        for (int i = 0; i < 4; i++) {
            threads_with_priority_1_3_5_7_respectively_Update_counter_in_each_for_10ms counter = new threads_with_priority_1_3_5_7_respectively_Update_counter_in_each_for_10ms();
            Thread thread = new Thread(counter, "Thread " + (i + 1));
            thread.setPriority(priorities[i]);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace(); } }}
}
