package streamApi.streamFilterExamplesOfObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ResidentProgram {
    public static void main(String[] args) {
        ResidentIO residentIO= new ResidentIO();

        List<Resident> residentList= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);

        char ch ='y';
        do{
            residentList.add(residentIO.readResidentData());
            System.out.println("Do you want to add more resident(y/n): ");
            ch=scanner.next().charAt(0);
        }while(ch=='y');
        /*for(int i=1; i<3; i++){
            residentList.add(residentIO.readResidentData());
        }*/
        System.out.println(residentList);

        int nepalCount;
        int indiaCount;
        int greenCardCount;
        int citizenCount;
        int h1bCount;

        nepalCount=residentList.stream().
                filter(resident -> resident.getOriginCountry().equalsIgnoreCase("nepal")).collect(Collectors.toList()).size();
        System.out.println("total count of origin nepal is: "+nepalCount);

        indiaCount= residentList.stream().
                filter(resident -> resident.getOriginCountry().equalsIgnoreCase("india")).collect(Collectors.toList()).size();
        System.out.println("Total count of origin india is: "+indiaCount);

        greenCardCount= residentList.stream().
                filter(resident -> resident.getVisaStatus().equalsIgnoreCase("green card")).collect(Collectors.toList()).size();
        System.out.println("count of green card resident "+greenCardCount);

        citizenCount= residentList.stream().
                filter(resident -> resident.getVisaStatus().equalsIgnoreCase("citizen")).collect(Collectors.toList()).size();
        System.out.println("count of citizen resident: "+citizenCount);

        h1bCount= residentList.stream().
                filter(resident -> resident.getVisaStatus().equalsIgnoreCase("h1")).collect(Collectors.toList()).size();
        System.out.println("count of h1 resident: "+h1bCount);

        

    }
}
