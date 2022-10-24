public class AlfredTest {

    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting("Alfred The Bot: ");
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane: ");
        String testAlfredIntroduction= alfredBot.alfredIntroduction("Alfred The Bot: ");
        String testGuestIntroduction= alfredBot.guestIntroduction("Beth Kane");
        String testGuestQuestion= alfredBot.guestQuestion("Beth Kane: ");
        String testDateAnnouncement = alfredBot.dateAnnouncement("Alfred The Bot: ");
        String testAlfredSining = alfredBot.alfredSining(
            "Alfred The Bot: ",
            "I like to move it move, he likes to move it move it, she likes to move it move it, we likes to??, move it"
        );
        String alexisTest = alfredBot.respondBeforeAlexis(
            "Beth Kane: ",
            "Alexis! Play some low-fi beats. ",
            "Alfred The Bot: ",
            "No need to, I already went throught your data and collected the best playlist you could ever imagine based on your intrests"
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "Beth Kane: ",
            "I can't find my yo-yo. Maybe Alfred will know where it is.",
            "Alfred The Bot: ",
            "Its in the second drawer, Beth"
        );
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Beth Kane: ",
            "Maybe that's what Batman is about. Not winning. But failing..",
            "Alfred The Bot: ",
            "Indeed Beth, failure and mistakes build us and make us stronger, and also dead inside, but who cares"
        );
        
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testAlfredIntroduction);
        System.out.println(testGuestIntroduction);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(testAlfredSining);
    }
}
