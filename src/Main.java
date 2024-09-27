
public class Main {
    public static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 100; j++) {
            Thread thread = new Test(j);
            thread.start();
        }
        Thread.sleep(2000);
        System.out.println(Test.i); // 100
    }
}

class Test extends Thread {
    public static int i = 0;
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // 1초 지연
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        plusI();
        System.out.println(j+"쓰레드");
    }
    public synchronized void plusI(){
        i++;
    }


    public int j;
    public Test(int j){
        this.j = j;
    }
}