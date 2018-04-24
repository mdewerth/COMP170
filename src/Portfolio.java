import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Building> buildings;
    private String portfolioName;
    private int portfolioID;

    private static int portfolioCount = 0;

    public Portfolio()	{
        buildings = new ArrayList<Building>();
    }

    public Portfolio(String portfolioName)	{
        buildings = new ArrayList<Building>();
        this.setPortfolioName(portfolioName);
        portfolioID = portfolioCount;
        portfolioCount ++;
    }

    public void addBuilding(Building building)	{
        buildings.add(building);
    }
    public String toString()    {
        return portfolioName;
    }

    /**
     * @return the portfolioName
     */
    public String getPortfolioName() {
        return portfolioName;
    }

    /**
     * @param portfolioName the portfolioName to set
     */
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public ArrayList<Building> getBuildings()	{
        return buildings;
    }

    public int getPortfolioID()	{
        return portfolioID;
    }
}
