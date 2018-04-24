public class TestMain {
    public static void main(String[] args)  {

        Portfolio cbre;
        Portfolio forestCity;
        cbre = new Portfolio("CBRE Group");
        forestCity = new Portfolio("Forest City Enterprises");

        Building sheridan;
        Building devon;
        Building broadway;
        sheridan = new Building("6400 Sheridan","6400 Sheridan RD, Chicago IL, 60626",4);
        devon = new Building("Devon Apartments", "300 Devon Ave, Chicago IL, 60626",2);
        broadway = new Building("Broadway Suites", "6300 Broadway Ave, Chicago IL, 60611", 2);

        cbre.addBuilding(sheridan);
        cbre.addBuilding(devon);
        forestCity.addBuilding(broadway);

        Apartment sheridanA;
        Apartment sheridanB;
        Apartment sheridanC;
        Apartment sheridanD;
        Apartment devonA;
        Apartment devonB;
        Apartment broadwayA;
        Apartment broadwayB;

        sheridanA = new Apartment("01");
        sheridanB = new Apartment("02");
        sheridanC = new Apartment("11");
        sheridanD = new Apartment("12");
        devonA = new Apartment("01");
        devonB = new Apartment("02");
        broadwayA = new Apartment("01");
        broadwayB = new Apartment("02");

        sheridan.addApartment(sheridanA);
        sheridan.addApartment(sheridanB);
        sheridan.addApartment(sheridanC);
        sheridan.addApartment(sheridanD);
        devon.addApartment(devonA);
        devon.addApartment(devonB);
        broadway.addApartment(broadwayA);
        broadway.addApartment(broadwayB);

        Lease sheridanA2018;
        Lease sheridanB2018;
        Lease sheridanC2018;
        Lease sheridanD2018;
        Lease devonA2018;
        Lease devonB2018;
        Lease broadwayA2018;
        Lease broadwayB2018;

        sheridanA2018 = new Lease("Smith", 500, 2018,01,01);
        sheridanB2018 = new Lease("Jones", 500,2018,01,01);
        sheridanC2018 = new Lease("O\'Malley", 500,2018,01,01);
        sheridanD2018 = new Lease("Murphy",500,2018,01,02);
        devonA2018 = new Lease("Bowser",700,2018,02,01);
        devonB2018 = new Lease("Karl",700,2018,02,01);
        broadwayA2018 = new Lease("DeWerth", 900,2018,01,01);
        broadwayB2018 = new Lease("Halligan",900,2018,01,01);

        sheridanA.addLease(sheridanA2018);
        sheridanB.addLease(sheridanB2018);
        sheridanC.addLease(sheridanC2018);
        sheridanD.addLease(sheridanD2018);
        devonA.addLease(devonA2018);
        devonB.addLease(devonB2018);
        broadwayA.addLease(broadwayA2018);
        broadwayB.addLease(broadwayB2018);

        System.out.println(cbre.getBuildings());
        System.out.println(sheridan.getApartments());
        System.out.println(sheridanA.getLeases());
    }
}
