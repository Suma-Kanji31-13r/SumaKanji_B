package Threading;
class SharedResource {
    private int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println("Count: " + count); }}
class ThreadA extends Thread {
    private SharedResource sharedResource;
    public ThreadA(SharedResource sharedResource) {
        this.sharedResource = sharedResource; }
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment(); } }}
class ThreadB extends Thread {
    private SharedResource sharedResource;
    public ThreadB(SharedResource sharedResource) {
        this.sharedResource = sharedResource; }
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment(); }}}
public class Method_Level_Synchronization {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ThreadA threadA = new ThreadA(sharedResource);
        ThreadB threadB = new ThreadB(sharedResource);
        threadA.start();
        threadB.start();}
}
