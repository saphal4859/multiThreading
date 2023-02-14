package test;

public class WaitNotify {

	public static void main(String[] args) {
		Process p = new Process();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("Thread 1");
				try {
					p.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("Thread 2");
				try {
					p.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();t2.start();
	}
}

class Process {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Produce method starterd & Paused");
			wait();
			System.out.println("Produce method resumed");
		}
	}

	public void consume() throws InterruptedException {
		//Making sure produce method gets the chance first
		//Because, If consume method gets triggered process will never stop.
		//As there wont be anyone to notify the Produce method.
		//And It will be waiting forever.
		//Make sure all wait methods will be called by notify method.
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("consume method starterd & Paused");
			notify();
			System.out.println("consume method resumed");
			Thread.sleep(7000);
		}
	}
}