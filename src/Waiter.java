import java.util.Date;

public class Waiter implements Runnable {

	/*** A Waiter class reading text message from Message class */

	private Message message;

	public Waiter(Message message) {
		this.message = message;
	}

	public void run() {
		// Synchronized context is necessary for wait()
		// The below synchronized block will lock message object

		synchronized (message) {
			try {
				System.out.println("Waiter is waiting for the Notifier at " + new Date());

				// Release lock on message for Notifier
				message.wait();
			}

			catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
		// Synchronized block over, now message object is no more locked
		// Notifier notifies using notify() on message

		System.out.println("Waiter is done waiting at " + new Date());

		// Reading shared message set by Notifier
		System.out.println("Waiter got the message: " + message.getTextMessage());
	}
}