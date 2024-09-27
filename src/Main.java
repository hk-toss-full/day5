
public class Main {
    public static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        for (int j = 0; j < 100; j++) {
            Thread thread = new Test(j, count);
            thread.start();
        }
        Thread.sleep(2000);
        System.out.println(count.i); // 100
    }
}

class Test extends Thread {

    public Count count;
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // 1초 지연
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Main.i++;
        count.plusI();
    }


    public int j;
    public Test(int j, Count count){
        this.j = j;
        this.count = count;
    }
}
class Count {
    int i;
    public Count(int i){
        this.i = i;
    }
    public synchronized void plusI(){
        i+=1;
    }
}