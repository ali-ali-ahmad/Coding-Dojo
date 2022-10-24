import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting(String botName) {
        boolean respone = true;
        return botName + "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return name + "Ohh, Hello Sir!, Who are you?";
    }

    public String alfredIntroduction(String botName) {

        return botName + "Excuse my manners ma'am!, I am Alfred the Bot, Alfred has requested from me to replace him while he's away";
    }

    public String guestIntroduction(String name) {
        
        return name + ": I see!, Well Alfred the Bot, nice to meet you, my name is " + name;
    }

    public String guestQuestion(String name) {
        
        return name + "Alfred, the Bot, what's the date today";
    }
    
    public String dateAnnouncement(String botName) {
        Date date = new Date();
        return botName + "Of course Beth, Today date is: " + date;
    }
    
    public String respondBeforeAlexis(String name, String conversation, String botName, String alfredReply ) {

        return name + conversation + botName + alfredReply;
    }
    
    public String alfredSining(String botName, String song) {
        
        return botName + song;
    }

}


