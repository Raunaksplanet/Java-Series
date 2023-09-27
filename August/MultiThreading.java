// 1.MultiThreading
// 1.1.Creating thread by extending Thread class.
class mythread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i != 1000){
            System.out.println("Thread 1");
            i++;
        }
    }
}

class mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i != 1000){
            System.out.println("Thread 2");
            i++;
        }
    }
}

// 1.2.Creating thread by implements Runnable Interface.
class mythread3 implements Runnable{
    int i = 0;
    public void run(){
            while(i != 1000){
            System.out.println("This is thread 3");
                i++;
        }
    }
}

class mythread4 implements Runnable{
    int i = 0;
    public void run(){
            while(i != 1000){
            System.out.println("This is thread 4");
                i++;
        }
    }
}


public class MultiThreading {
    public static void main(String args[]) {
        
        // 1.1.Creating thread by extending Thread class.
        mythread t1 = new mythread();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();

        // 1.2.Creating thread by implements Runnable Interface.
        mythread3 t3 = new mythread3();
        Thread t33 = new Thread(t3);

        mythread4 t4 = new mythread4();
        Thread t44 = new Thread(t4);

        t33.run();
        t44.run();

    }
}
