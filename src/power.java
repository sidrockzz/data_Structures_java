class thread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+" Thread "+Thread.currentThread().getName());
            //Thread.yield();
        }
    }
}
public class power{
public static void main(String [] args) throws Exception{
    thread1 t1 = new thread1();
    thread1 t2 = new thread1();
    thread1 t3 = new thread1();
    Thread T1 = new Thread(t1,"one");
    Thread T2 = new Thread(t2,"two");
    Thread T3 = new Thread(t3,"three");
    T3.setPriority(Thread.MAX_PRIORITY);
    T2.setPriority(Thread.MIN_PRIORITY);
    T1.start();
    T2.start();
    T3.start();
    //T3.join();
}
}