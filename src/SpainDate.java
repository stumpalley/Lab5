
public class SpainDate extends GregorianDate {

    public SpainDate(String month, int day, int year) {
        super(month, day, year);
    }

    @Override
    public boolean isLeap() {
        if (getYear() < 1582) {
            return (getYear() % 4 == 0);
        }

        return super.isLeap();
    }

    @Override
    public boolean isLastDay() {
        if (getYear() < 1555 && getMonth() == 12 && getDay() == 31) {
            setMonth(3);
            setDay(24);
            return true;
        }
        return super.isLastDay();
    }

    @Override
    public boolean isChangedForSpecialDay() {
        if (getMonth() == 10 && getDay() == 4 && getYear() == 1582) {
            setDay(15);
            return true;
        }
        return false;
    }

}
