import java.util.Date;

public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello, Today it's going to be a great day!";
    }
    public String guestGreeting( String name, String dayPeriod ){
        return String.format( "Good %s, %s. Nice to see you.", dayPeriod, name );
    }

    public String dateAnnouncement(){
        return String.format("It is currently %s", new Date());
    }

    public String respondBeforeAlexis(String sentence){
        if( sentence.indexOf("Alexis") > -1 ){
            return "She certainly isn't sophisticated enough for that. How can I help you?";
        }

        if (sentence.indexOf("Alfred") > -1) {
            return "As you wish, naturally. How can I be useful?";
        }

        return "Right. And with that I shall retire.";
    }

}