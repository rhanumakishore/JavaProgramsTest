
public class Message {
/*** A Message class shared between Waiter and Notifier  */
   
//  volatile guarantees latest value to Waiter and Notifier. 
    public Message(String textMessage) { 

        this.textMessage = textMessage;
    } 
    
    private volatile String textMessage; 
       
    public String getTextMessage() {
     return  textMessage;
    }
    public void setTextMessage(String textMessage){
      this.textMessage = textMessage;
    }      
}
