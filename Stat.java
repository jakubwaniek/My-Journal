/**
 * @author Jakub Waniek <jakubwaniek1@gmail.com>
 */
public class Stat
{
    /**
     * The rating from 1 to 5 of the Stat
     */
    private int rating;
    
    /**
     * A short justification for the rating
     */
    private String details;

    /**
     * Sets the rating for the Stat
     * 
     * @param r The rating to which rating should be set to
     * @return true if the rating is valid, false otherwise
     */
    public boolean rate(final int r) {
        if (r < 1 || r > 5)
            return false;
        rating = r;
        return true;
    }

    /**
     * @return rating
     */
    public getRating() {
        return rating;
    }

    /**
     * Sets the details for the rating
     * 
     * @param d The details to set to
     * @return true is the details are valid (i.e. non-empty), false otherwise
     */
    public boolean setDetails(final String d) {
        if (d.isEmpty())
            return false;
        details = d;
        return true;
    }

    /**
     * @return details
     */
    public getDetails() {
        return details;
    }
}