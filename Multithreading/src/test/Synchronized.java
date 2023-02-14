package test;

public class Synchronized {

	public static int counter;
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					increment();
				}
			}
		});
		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					increment();
				}
			}
		});
		t1.start();t2.start();
		t1.join();t2.join();
		System.out.println(counter);
	}
	public static synchronized void increment() {
		counter++;
	}
}

