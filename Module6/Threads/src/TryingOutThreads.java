
public class TryingOutThreads {

	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		Producer producer = new Producer(bucket);
		Consumer consumer = new Consumer(bucket);
		
		producer.start();
		consumer.start();
//		Thread t1 = new Thread(new MyRunnable("t1"));
//		Thread t2 = new Thread(new MyRunnable("t2"));
//		Thread t3 = new Thread(new MyRunnable("t3"));
//		
//		t1.start();
//		t2.start();
//		t3.start();
	}

}
