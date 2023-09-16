package learning;

class Hii implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hello2 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = new Hii();
		Runnable obj2 = new Hello();
		
		Thread hi = new Thread(obj1);
		Thread hello = new Thread(obj2);
		hi.start();
		Thread.sleep(10);
		hello.start();
		hi.join();
		hello.join();
		System.out.println("end");
	}

}
