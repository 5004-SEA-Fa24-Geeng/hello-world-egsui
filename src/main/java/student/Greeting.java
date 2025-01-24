package student;

/**
 * This class is a placeholder which you will fully implement based on the javadoc.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {
    /** String holds the locality ID.*/
    private final int localityID;
    /** String holds the locality name.*/
    private final String localityName;
    /** String holds the ASCII greeting.*/
    private String asciiGreeting = "Hello";
    /** String holds the Unicode greeting.*/
    private String unicodeGreeting = "Hello";
    /** String holds the format of greeting.*/
    private String formatStr = "%s, %%s!";

    /**
     * This is the constructor for the Greeting class.
     * Default greeting that creates "Hello, {name}!".
     * @param localityID id of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this.localityID = localityID;
        this.localityName = localityName;
    }

    /**
     * This is the constructor for the Greeting class.
     * Greeting that creates a greeting with ascii and Unicode characters assuming the language is already
     * using ascii letters only. It also assumes the format of the greeting to be "{greeting}, {name}!"
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param greeting greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = greeting;
        this.unicodeGreeting = greeting;
    }

    /**
     * This is the constructor for the Greeting class.
     * Greeting that creates a greeting with ascii and Unicode characters.
     * It makes no assumptions and everything needs to be provided.
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param asciiGreeting greeting using ascii characters
     * @param unicodeGreeting greeting using Unicode characters
     * @param formatStr format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality id number.
     * @return the locality id number
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Returns the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Returns the Unicode greeting. Just the greeting, no formatting.
     * @return the Unicode greeting
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the unicode format string. This string will have a %s, so that the name
     * can be inserted into the greeting in the correct location.
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format. This string will have a %s,
     * so that the name can be inserted into the greeting in the correct location.
     * @param asciiOnly if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, this.asciiGreeting);
        }
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes. Example string format:
     *  {localityID:1, localityName:"Hawaii", asciiGreeting:"Aloha", unicodeGreeting:"Aloha"}
     * @return the full greeting details as a string
     */
    public String toString() {
        return "{localityID:" + this.localityID + ", localityName:\"" + this.localityName + "\", asciiGreeting:\""
                + this.asciiGreeting + "\", unicodeGreeting:\"" + this.unicodeGreeting + "\"}";
    }

}
