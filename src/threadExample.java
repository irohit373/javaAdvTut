public class threadExample {
    public static void main(String[] args) {
            for (int i = 0; i < 6; i++) {
                Thread1 t1 = new Thread1();
                t1.start();
                // implementing runnabel have a other inintalizing step
                Thread t2 = new Thread(new Thread2());
                t2.start();
            }
    }
}

class Thread1 extends Thread {
    public void run(){    
        System.out.println("Thread 1 is running");
    }
}


// Implements use to free extend for Parent Child class extnsions of extend 
class Thread2 implements Runnable{
  
    @Override
    public void run() {
        try {
            System.out.println("Thread 2 is running");
        } catch (Exception e) {
            System.out.println("err running thread 2");
        }
    }
 }

