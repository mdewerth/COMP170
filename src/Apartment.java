import java.util.ArrayList;

public class Apartment {
    private ArrayList<Lease> leases;
    private Lease currentLease;
    private int unitID;
    private String address;


    public static int unitCounter = 0;

    public Apartment()	{
        leases = new ArrayList<Lease>();
    }

    public Apartment(String address)	{
        leases = new ArrayList<Lease>();
        this.address = address;
        unitID = unitCounter;
        unitCounter ++;
    }

    public void addLease(Lease lease)	{
        this.currentLease = lease;
        leases.add(lease);
    }

    public String toString()    {
        return address;
    }

    public Lease getCurrentLease()	{
        return currentLease;
    }
    public ArrayList<Lease> getLeases()	{
        return leases;
    }
    public int getUnitID()	{
        return unitID;
    }
    public String getAddress()	{
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
