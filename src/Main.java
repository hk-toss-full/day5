
public class Main {
    public static int i = 0;
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            Thread thread = new Test();
            thread.start();
        }
    }
}

class Test extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // 1초 지연
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("쓰레드");
    }
}