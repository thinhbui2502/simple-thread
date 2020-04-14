public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator);
        thread2.start();
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
    }
}
