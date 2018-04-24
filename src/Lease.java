import java.time.LocalDate;
import java.util.Calendar;

public class Lease {
    private int id;
    private String name;
    private int rent;
    private int paid;
    private int rentOwed;
    private int rentDue;
    private LocalDate begin;
    private LocalDate end;

    public static int leaseCounter = 0;

    //null constructor

    public Lease()	{
        id = 0;
        name = null;
        setRent(0);
        paid = 0;
        rentOwed = 0;
        rentDue = 0;
        begin = null;
        end = null;

    }

    //normal constructor

    public Lease(String name, int rent, int leaseYear, int leaseMonth, int leaseDay)	{
        this.name = name;
        this.rent = rent;
        paid = 0;
        rentOwed = rent - paid;
        rentDue = rent - rentOwed;
        begin = LocalDate.of(leaseYear, leaseMonth, leaseDay);
        end = begin.plusMonths(12);
        id = leaseCounter;
        leaseCounter ++;

    }



    public String toString()    {
        return name;
    }



    public int payRent(int payment)	{
        paid += payment;
        return paid;
    }

    public int monthReset()    {
        Calendar now = Calendar.getInstance();
        int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
        while(dayOfMonth == 1)   {
            paid = 0;
        }
        return paid;
    }

    public int getLease()	{
        return id;
    }

    public String getName()	{
        return name;
    }
    public void setLeaseName(String name) {
        this.name = name;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
    public void setRentOwed()   {
        rentOwed = rent;
    }

    public int getRentDue()	{
        return rentDue;
    }
    public void setPaid()   {
        paid = 0;
    }
    public void setRentDue()    {
        rentDue = rentOwed - paid;
    }
    public LocalDate getEndDate()	{
        return end;
    }
    public void setBegin()  {
        this.begin = begin;

    }

}
