package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting = "Hello";
    private String unicodeGreeting = "Hello";
    private String formatStr = "%s, %%s!";

    public Greeting(int localityID, String localityName) {
        this.localityID = localityID;
        this.localityName = localityName;
    }

    public Greeting(int localityID, String localityName, String greeting) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = greeting;
        this.unicodeGreeting = greeting;
    }

    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    public int getLocalityID() {
        return this.localityID;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    public String getFormatStr() {
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, this.asciiGreeting);
        }
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    public String toString() {
        return "{localityID:" + this.localityID + ", localityName:\"" + this.localityName +
                "\", asciiGreeting:\"" + this.asciiGreeting + "\", unicodeGreeting:\"" + this.unicodeGreeting +"\"}";
    }

}
