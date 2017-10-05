/**
 * Main class performing sleep(), wait() and notify() over Message, Waiter and
 * Notifier classes
 */
public class ThreadDemo {

 public static void main(String[] args) {

  // Simple Message with Hello World! as text message
  Message message = new Message("Hello World!");

  // Waiter thread waiting for message from Notifier
  Waiter waiter = new Waiter(message);
  Thread waiterThread = new Thread(waiter, "Waiter Thread");
  waiterThread.start();

  // Notifier thread notifying message to Waiter
  Notifier notifier = new Notifier(message);
  Thread notifierThread = new Thread(notifier, "Notifier Thread");
  notifierThread.start();

 }
}
