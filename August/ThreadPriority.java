class mythread extends Thread{
    
    public mythread(String name){
        super(name);

    }
    
    public void run(){
        int i = 0;
        while( i != 600){
            System.out.println("Thread priority: " + getPriority());
            System.out.println("Thread ID: " + getId());
            System.out.println("Thread name: " + getName());
            System.out.println("\n");
            i++;
        }
    }
}



public class ThreadPriority {
    public static void main(String args[]) {
        
        // 1.1.Creating thread by extending Thread class.
        mythread t1 = new mythread("Raunak MIN_PRIORITY");
        mythread t2 = new mythread("Raunak2 NORM_PRIORITY");
        mythread t3 = new mythread("Raunak3 MAX_PRIORITY");
                
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
               
        // System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
    }
}
