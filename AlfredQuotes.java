import java.util.Date;
public class AlfredQuotes {
    // Making a variable that holds the imported date
    Date todaysDate = new Date();

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod) {
        // This is Javas f string. Using % followed by the data type. In this case s. So %s, if it were an integer it would be %d
        return String.format("Good %s, %s. Nice to have you.", dayPeriod, name);
    }
    public String dateAnnouncement() {
        return String.format("Today is %s", todaysDate);
    }

    public String respondBeforeAlexis(String conversation) {
        // With this .indexOf("") it's returning an integer. If it finds the Word im looking for it'll tell me the index of where it starts. If it doesn't find it it will return -1. So to test this true or false statement you have to check if the index number it's returning is going to be greater than or equal 0
        if(conversation.indexOf("Alexis") >=0 ){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") >=0){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}