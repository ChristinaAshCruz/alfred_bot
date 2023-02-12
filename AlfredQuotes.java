import java.util.Date;

public class AlfredQuotes {
    

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guestGreetingOutput = String.format("Hello, %s. Lovely to see you.", name);
        return guestGreetingOutput;
    }
    //NINJA BONUS
    public String guestGreeting(String name, String secondName){
        String guestGreetingOutput2 = String.format("Good day, %s. %s has told me many good things about you.", name, secondName);
        return guestGreetingOutput2;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        String dateAnnouncementOutput = String.format("It is currently %s.", date);
        return dateAnnouncementOutput;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return "Right away Sir! She certainly isn't sophisticated enough for that." ;
        }
        if (conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally." ;
        }
        return "Right. And with that I shall retire.";
    }
    

    // SENSEI BONUS
    public String askAboutBruce(String name,String conversation) {
        if (conversation.indexOf("Bruce") > -1){
            String alfredBruceResponse = String.format("Sorry, %s, you know all of my information about Bruce is confidential. But, he's more than capable of taking care of himself.", name);
            return alfredBruceResponse;
        }
        return "Good question. I'll get on that as soon as possible!";
    }

}
