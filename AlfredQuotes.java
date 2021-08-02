import java.util.Date;
public class AlfredQuotes {

    Date todaysDate = new Date();

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Nice to have you.", dayPeriod, name);
    }
    public String dateAnnouncement() {
        return String.format("Today is %s", todaysDate);
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") >=0 ){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") >=0){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}