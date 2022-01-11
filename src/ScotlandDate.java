
public class ScotlandDate extends GregorianDate {

    public ScotlandDate(String month, int day, int year) {
		super(month, day, year);
    }

    @Override
    public boolean isLeap() {
        if (getYear() > 1599 && getYear() < 1752) {
            return (getYear() % 4 == 0);
        }

        else if (getYear() < 1600){
            return (getYear() % 4 == 3);
        }

        return super.isLeap();
    }

    @Override
    public boolean isLastDay() {
        if (getYear() < 1600 && getMonth() == 3 && getDay() == 24) {
            setMonth(1);
            setDay(0);
            return true;
        }
        return super.isLastDay();
    }

    @Override
    public boolean isChangedForSpecialDay() {
        if (getMonth() == 9 && getDay() == 2 && getYear() == 1752){
            setDay(15); 
            return true;
        }
        return false;
    }

}
