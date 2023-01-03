package streamApi.streamFilterExamplesOfObject;

import java.util.Scanner;

public class ResidentIO {
    Scanner scanner= new Scanner(System.in);

    public Resident readResidentData(){
        Resident resident= new Resident();

        System.out.println("Enter name of resident: ");
        resident.setName(scanner.nextLine());

        System.out.println("Enter name of origin country: ");
        resident.setOriginCountry(scanner.nextLine());

        System.out.println("Enter visa status of resident: ");
        resident.setVisaStatus(scanner.nextLine());

        return resident;
    }

    public void displayResidentData(Resident resident){
        System.out.println("Name: "+resident.getName());
        System.out.println("OriginCountry: "+resident.getOriginCountry());
        System.out.println("Visa Status: "+resident.getVisaStatus());

    }


}
