public class synchronizationSample {

    public static void main(String[] args) {
        MathUtils obj = new MathUtils();
        
        Thread t1 = new Thread1(obj);

        Thread t2 = new Thread(new Thread2(obj));
        t1.start();
        t2.start();
    }
}

class MathUtils{
    // this synchronize (Lock the method)the all method 
    synchronized void getMultiples(int n){
    
        // synchronized (this) { //this is used to lock only a blick of code to lock as synchronized
            for (int i = 1; i < 6; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        // }
    }
}

class Thread1 extends Thread{
    MathUtils mu;

    Thread1(MathUtils mu) {
        this.mu = mu;
    }

    public void run(){
        try {
            mu.getMultiples(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Thread2 implements Runnable{
    MathUtils mu;

    Thread2(MathUtils mu){
        this.mu = mu;
    }

    public void run(){
        try {
            mu.getMultiples(3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
