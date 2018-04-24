import java.util.ArrayList;

public class Building {
    private ArrayList<Apartment> apartments;
    private int buildingID;
    private String buildingName;
    private String address;
    private int numberOfUnits;

    public static int buildingCounter = 0;

    public Building()	{
        apartments = new ArrayList<Apartment>();
    }

    public Building(String buildingName, String address, int numberOfUnits)	{
        apartments = new ArrayList<Apartment>();
        this.buildingName = buildingName;
        this.address = address;
        this.numberOfUnits = numberOfUnits;
        buildingID = buildingCounter;
        buildingCounter ++;

    }

    public int getBuildingID()	{
        return buildingID;
    }

    public void addApartment(Apartment apartment)	{
        apartments.add(apartment);
    }

    public String toString()    {
        return buildingName;
    }

    public ArrayList<Apartment> getApartments()	{
        return apartments;
    }
    public String getName()	{
        return buildingName;
    }
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    public String getAddress()	{
        return address;
    }
    public void setBuildingAddress(String address) {
        this.address = address;
    }
    public int getUnitCount()	{
        return numberOfUnits;
    }
    public void setUnitCount(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

}
