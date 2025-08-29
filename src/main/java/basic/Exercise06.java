package basic;

public class Exercise06 {

    public String readMonth(final int month) {
        final String[] months = {
                "Invalid month", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }
}
