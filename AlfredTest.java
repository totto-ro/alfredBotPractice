public class AlfredTest{

    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("María", "morning");
        String testDateAnnuncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some music");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my purse, maybe Alfred will know where it is");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnuncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);


    }


}