import java.util.Date;

public class Notifier implements Runnable {

	/*** A Notifier class writing Message vslue and notifies to waiter */

	private Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	public void run() {
		System.out.println("Notifier is sleeping for 5 seconds at " + new Date());

		// Sleeping current thread for 5 seconds.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException interruptedException) {
			interruptedException.printStackTrace();
		}

		// Synchronized context is necessary for notify()
		// The below synchronized block will lock message object
		synchronized (message) {

			// Writing into shared message object
			message.setTextMessage("Notifier took 5 seconds");
			System.out.println("Notifier is notifying waiting thread to wake up at " + new Date());

			// Notify the Waiter thread which is waiting for message
			message.notify();
		}
		// Synchronized block over, now message object is no more locked
	}
}