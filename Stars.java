/**
 * Takes a character and has a method to print that character a given number of times.
 */
public class Stars {
    private String option;

    /**
     * Constructs an stars printer with a given character option.
     *
     * @param option the character we are printing
     */
    public Stars(String option) {
        this.option = option;
    }

    /**
     * Returns the string value of option.
     * @return Option the graphing notation
     */
    public String getOption() {
        return option;
    }
    /**
     * Returns a string that is our character the desired number of times.
     * @param numStars the number of characters we want to print
     * @return result the final result
     */
    public String convert ( double numStars){
        // Creates an initial string
        String result = "";
        // Loops numstars times
        if (numStars < 0) {
            numStars *= -1;
        }
        for (int i = 0; i < numStars; i++) {
            // Adds onto initial string with our character
            result += option;
        }
        return result;
    }
}
