package in.thread;

import java.lang.Thread.State;

class Task implements Runnable{
	
	
	
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.print("hello");
//			th1.sleep(200);
		}
		
		
	}
	public void PrintDetails() {
		
//		
//			System.out.println("Current Thread Name  :"+th.toString());
	     	
			
		
	}
}
public class Program {

	public static void main(String[] args) {
	ThreadGroup group = new ThreadGroup("Total Threads");

//		Runnable target =new Task();
//		Thread th= new Thread( group, target,"user thread 123");
//		th.start();
//		
		Runnable target1 =new Task();
		Thread th1 = new Thread(target1,"user thread 12345");
		th1.start();
		
		 Thread current =th1.currentThread();
		 
		String Name = (th1.getName());
		System.out.println("Thread Name :" +Name);
		
		int priority= th1.getPriority();
		System.out.println("Current thread priority :"+th1.getPriority());
		
		ThreadGroup groupname = th1.getThreadGroup();
        System.out.println("Group name "+th1.getThreadGroup());
		
        State state=th1.getState();
        System.out.println("Current State of Thread  :"+th1.getState());
        
        boolean type=th1.isDaemon();
        System.out.println("Daemon or not  :"+ (type ? "Daemon ": "Non daemon"));
        
        boolean state1 = th1.isAlive();
        System.out.println("Alive or Not  :"+(state1 ? "Alive" : "Not ALive"));
        

	}

}
