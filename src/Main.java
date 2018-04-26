import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        String run = "";
        String create;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        Portfolio portfolio1 = new Portfolio();
        Building building1 = new Building();
        Apartment apartment1 = new Apartment();
        Lease lease1 = new Lease();



        System.out.println("Property Manager");
        System.out.println("Type a command to begin...");
        boolean done = false;
        while(!done) {
            System.out.println("\"END\" to end the program");
            System.out.println("\"CREATE\" to create a new entity");
            System.out.println("\"CHECK\" to check on rent");
            System.out.println("\"PAY\" to mark payment toward rent");
            run = keyboard.nextLine();
            while (run.equalsIgnoreCase("create"))  {
                System.out.println("Create a new entity: type an entity to begin:");
                System.out.println("\"PORTFOLIO\"");
                System.out.println("\"BUILDING\"");
                System.out.println("\"APARTMENT\"");
                System.out.println("\"LEASE\"");
                System.out.println("\"BACK\" to go home");

                create = keyboard.nextLine();
                //create portfolio
                if(create.equalsIgnoreCase("portfolio"))    {
                    System.out.println("Create new portfolio:");
                    System.out.println("Enter a name");
                    portfolio1.setPortfolioName(keyboard.nextLine());


                }
                //create building
                if (create.equalsIgnoreCase("building")) {
                    System.out.println("Create new building:");
                    System.out.println("Enter a name");
                    building1.setBuildingName(keyboard.nextLine());
                    System.out.println("Enter an address");
                    building1.setBuildingAddress(keyboard.nextLine());
                    System.out.println("Enter number of units");
                    building1.setUnitCount(Integer.parseInt(keyboard.nextLine()));
                    portfolio1.addBuilding(building1);


                }
                //create apartment
                if (create.equalsIgnoreCase("apartment"))   {
                    System.out.println("Create a new apartment");
                    System.out.println("Enter unit number");
                    apartment1.setAddress(keyboard.nextLine());
                    building1.addApartment(apartment1);

                }
                //create lease
                if(create.equalsIgnoreCase("lease"))   {
                    System.out.println("Create new lease:");
                    System.out.println("Enter a name");
                    lease1.setLeaseName(keyboard.nextLine());
                    System.out.println("Set rent rate:");
                    lease1.setRent(Integer.parseInt(keyboard.nextLine()));
                    lease1.setRentOwed();
                    lease1.setPaid();
                    lease1.setRentDue();
                    apartment1.addLease(lease1);


                }
                if(create.equalsIgnoreCase("back"))  {
                    break;
                }


            }
            if(run.equalsIgnoreCase("check"))    {
                System.out.println("Tenant owes " + lease1.getRentDue());



            }
            if(run.equalsIgnoreCase("pay"))  {
                System.out.println("Enter a payment amount");
                lease1.payRent(Integer.parseInt(keyboard.nextLine()));
                lease1.setRentDue();


            }
            if(run.equalsIgnoreCase("end")) {
                keyboard.close();
                done = true;
            }


        }




    }
}
