import java.text.SimpleDateFormat;
        import java.util.Date;

class Date_Format {
    public static void main(String args[]) {
        Date objDate = new Date(); // current system date is assigned to objDate

        System.out.println(objDate);

        String strDateFormat = "hh:mm:ss a dd-MMM-yyyy";

        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

        System.out.println(objSDF.format(objDate));
    }
}