package ustbatchno3.junit5testcases;
import java.util.HashMap;
import java.util.Scanner;






public class Vehiclenumber {

    public static void main(String[] args) {

        // create a database that maps vehicle numbers to state and district
        HashMap<String, String> vehicleMap = new HashMap<String, String>();
        vehicleMap.put("KA01AB1234", "Karnataka/Bangalore");
        vehicleMap.put("TN20BC5678", "Tamil Nadu/Chennai");
        vehicleMap.put("MH12DE9012", "Maharashtra/Pune");
        // add more entries to the database as needed

        // prompt the user to input the vehicle number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        String vehicleNumber = scanner.next();

        // search the database for the given vehicle number
        String stateAndDistrict = vehicleMap.get(vehicleNumber);

        // display the state and district to the user
        if (stateAndDistrict == null) {
            System.out.println("Vehicle number not found in the database");
        } else {
            System.out.println("State and district: " + stateAndDistrict);
        }
    }
}


