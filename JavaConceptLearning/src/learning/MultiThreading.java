//Thread is a unit of a process.
//Through thread we can reduce the execution time of a application through multiprocessing.
package learning;

//if we want to use Thread then we can extend Threads then we have to override the run() method with our logic.
//So instead of show() we have to move our code to run().
class Hi extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			//Thread.sleep() is a static method of class Thread. so, we don't need to extend thread or need object of it.
			//Thread.sleep() might throw exception. so, we have to enclose it into try catch block.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Hello extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) throws Exception {
		Hi hi = new Hi();
		Hello hello = new Hello();
		//instead of calling the run method we have to call start() method of thread. through this run() method will be called.
		//and the threads runs in parallel.
		hi.start();
		//we have given Thread.sleep() here to synchronize the execution of Hi and Hello.
		Thread.sleep(10);
		hello.start();

	}

}
