
public class Bucket {

	boolean isAvailable = false;
	int value = 0;
	public synchronized int get() {
		while (!isAvailable){
			try{
				wait();
			} catch (InterruptedException e){
				
			}
		}
		isAvailable = false;
		notifyAll();
		return value;
	}

	/**
	 *  Method description here
	 * @param nextInt value produced by producer
	 */
	public synchronized void put(int nextInt) {
		while (isAvailable){
			try{
				wait();
			} catch (InterruptedException e){
				
			}
		}
		isAvailable = true;
		notifyAll();
		this.value = nextInt;
	}

}
