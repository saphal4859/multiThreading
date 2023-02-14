package test;

public class SynchronizedLockSolution {
	public static int counter1;
	public static int counter2;
	private final static Object lock1= new Object();
	private final static Object lock2= new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {

				for(int i=0;i<10;i++) {
					System.out.println("Thread 1");
					increment1();
				}
			}
		});
		Thread t2= new Thread(new Runnable() {

			@Override
			public void run() {

				for(int i=0;i<10;i++) {
					System.out.println("Thread 2");
					increment2();
				}
			}
		});

		t1.start();t2.start();
		t1.join();t2.join();
		System.out.println(counter1);
		System.out.println(counter2);
	}
	public static  void increment1() {
		synchronized (lock1) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter1++;
			System.out.println("1");
		}
	}
	public static void increment2() {
		synchronized (lock2) {
			counter2++;
			System.out.println("2");
		}
	}
}

