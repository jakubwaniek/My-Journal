/**
 * @author Jakub Waniek <jakubwaniek1@gmail.com>
 */
public class Stat
{
    /**
     * The value of the Stat from 1 to 5
     */
    private int value;
    
    /**
     * A brief justification for the value
     */
    private String details;

    /**
     * An array of tags associated with the justification (for easy sorting)
     */
    private String[] tags;

    /**
     * Constructor for a Stat
     * 
     * @param value The value of the stat from 1 to 5 (w/ validation)
     * @param details The justification for the value
     * @param tags The tags as a single string (raw input, to be parsed into an array of String tags)
     */
    public Stat(final int value, final String details, final String tags) {
        if (value > 1 && value < 5)
            this.value = value;
        else {
            System.out.println("Invalid value " + value);
            return;
        }

        if (details.isEmpty())
            this.details = null;
        else
            this.details = details;

        if (tags.isEmpty())   
            this.tags = null;
        else
            this.tags = tags.split(", ");
    }
    
    /**
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * @return details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @return tags
     */
    public String[] getTags() {
        return tags;
    }
}
