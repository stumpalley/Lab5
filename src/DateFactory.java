
public class DateFactory {

    /*
     * should return a date of the appropriate type depending on the parameter
     * where.
     * As now written it ignores the last parameter
     */

    public GregorianDate createDate(String month, int day, int year, String where) {
        if(where.equals("Spain")){
            return new SpainDate(month, day, year);
        }

        else if(where.equals("Scotland")){
            return new ScotlandDate(month, day, year);
        }
    
        return new GregorianDate(month, day, year);
    }


}