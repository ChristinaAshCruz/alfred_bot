public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );

        //NINJA BONUS
        String guestGreeting2 = alfredBot.guestGreeting("Beth", "Bruce");
        
        //SENSEI BONUS
        String askAboutBruce = alfredBot.askAboutBruce("Beth", "So, Alfred, what has Bruce been up to nowadays?");
        String askAboutBruce2 = alfredBot.askAboutBruce("Beth", "What were you like when you were younger?");

        System.out.println(testGreeting);
        
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);

        // NINJA & SENSEI BONUS
        System.out.println(guestGreeting2);
        System.out.println(askAboutBruce);
        System.out.println(askAboutBruce2);
    }
}
