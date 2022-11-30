package OOP_Operations_With_Airport;

import OOP_Operations_With_Airport.model.Plane;
import OOP_Operations_With_Airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane plane3 = service.createPlane();
        Plane[] planes = {plane, plane2, plane3};
        System.out.println("Print name and release date");
        service.printNameAndReleaseDAte(plane);
        System.out.println("1.-----------------------------");
        System.out.println("Print name if release date is bigger then 2000 otherwise print hours spent in air");
        service.printNameOrHors(plane);
        System.out.println("2.-----------------------------");
        System.out.println("Print name of the plane which spends more hours in air");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane,plane2));
        System.out.println("3.-----------------------------");
        System.out.println("Return the plane which name is bigger");
        service.planeWithBiggerName(plane,plane2).printInfo();
        System.out.println("4.-----------------------------");
        System.out.println("Parameter array of Plans. Print information of all plans");
        service.printPlaneArray(planes);
        System.out.println("5.-----------------------------");
        System.out.println("Parameter array of Plans. Print planes which have release date after 2010 and are military ones");
        service.printMilitaryPlanesAfter2010(planes);
        System.out.println("6.------------------------------");
        System.out.println("Parameter array of Plans. Return the plane with maximal time spent in air");
        service.maxHoursInAir(planes).printInfo();
        System.out.println("7.------------------------------");
        System.out.println("Parameter array of Planes. Print information of the oldest plane");
        service.printOldestPlane(planes);
        System.out.println("8.-----------------------------");
        System.out.println("Parameter array of Planes. Print newest plane among military ones");
        service.printNewestMilitary(planes);
        System.out.println("9.-----------------------------");
        System.out.println("Parameter array of Planes. Print planes sorted by release date in ASC form");
        service.sortByReleaseYear(planes);

    }
}
