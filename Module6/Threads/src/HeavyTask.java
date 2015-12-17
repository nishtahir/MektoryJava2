import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.SwingWorker;

public class HeavyTask extends SwingWorker<String, String>{

	@Override
	protected String doInBackground() throws Exception {
		int progress = 0;
		
		while (progress < 100 & !isCancelled()){
			Thread.sleep(2000);
			progress += ThreadLocalRandom.current().nextInt(20);
			setProgress(progress);
			
		}
		return "Complete";
	}

	@Override
	protected void process(List<String> chunks) {
		// TODO Auto-generated method stub
		super.process(chunks);
	}

}
