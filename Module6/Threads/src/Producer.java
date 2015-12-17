import java.util.concurrent.ThreadLocalRandom;

public class Producer extends Thread {

	private Bucket bucket;

	public Producer(Bucket bucket) {
		this.bucket = bucket;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int val = ThreadLocalRandom.current().nextInt();
			bucket.put(val);
			System.out.println("Producer produced: " + val);
		}
	}
}
