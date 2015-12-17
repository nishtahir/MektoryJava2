import java.io.BufferedReader;
import java.util.Date;

public class MyRunnable implements Runnable {
	String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(new Date().toString());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}