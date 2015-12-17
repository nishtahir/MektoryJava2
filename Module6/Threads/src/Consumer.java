import java.util.Date;

public class Consumer extends Thread {

	private Bucket bucket;

	public Consumer(Bucket bucket) {
		this.bucket = bucket;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int value = bucket.get();
			System.out.println("Consumer got: " + value);
		}
	}
}
