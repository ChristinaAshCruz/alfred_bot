import java.util.Date;

public class AlfredQuotes {
    
    private String name;

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        this.name = name;
        String guestGreetingOutput = String.format("Hello, %s. Lovely to see you.", name);
        return guestGreetingOutput;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String dateAnnouncementOutput = String.format("It is currently %s.", date);
        return dateAnnouncementOutput;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!

}
