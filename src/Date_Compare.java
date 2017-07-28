import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class Date_Compare {
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");

        Date dt_1 = objSDF.parse("20-08-1981");
        Date dt_2 = objSDF.parse("12-10-2012");

        System.out.println("Date1 : " + objSDF.format(dt_1));
        System.out.println("Date2 : " + objSDF.format(dt_2));

        if (dt_1.compareTo(dt_2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        }

        else if (dt_1.compareTo(dt_2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        }

        else if (dt_1.compareTo(dt_2) == 0) {
            System.out.println("Both Dates are the same");
        }

        else {
            System.out.println("It's happening, Morty. We stepped out of linear time.");
        }
    }
}
