public class Main {


    public static void main(String[] args){
        //Created with default values
        new House();
        new House();
        new House();

        new Villa();
        new Villa();
        new Villa();

        new Summerhouse();
        new Summerhouse();
        new Summerhouse();


        System.out.println("Sum of all houses prices: " + HouseService.sumHousePrices()+" tl");
        System.out.println("Sum of all villas prices: " + HouseService.sumVillaPrices()+" tl");
        System.out.println("Sum of all summerhouses prices: " + HouseService.sumSummerhousePrices()+" tl");

        System.out.println("Sum of  all real estates prices: " + HouseService.sumAllPrices()+" tl");


        System.out.println("Average of all houses square meters: " + HouseService.averageHouseSquareMeter()+" m^2");
        System.out.println("Average of all villas square meters: " + HouseService.averageVillaSquareMeter()+" m^2");
        System.out.println("Average of all summerhouses square meters: " + HouseService.averageSummerhouseSquareMeter()+" m^2");

        System.out.println("Average of  all real estates square meters: " + HouseService.averageAllSquareMeter()+" m^2");

        System.out.println("Real estates that are 2+1: " + HouseService.filterAllByRoomCount(2,1).toString());

        /*  Output:
            Sum of all houses prices: 1492500 tl
            Sum of all villas prices: 2550000 tl
            Sum of all summerhouses prices: 9600000 tl
            Sum of  all real estates prices: 13642500 tl
            Average of all houses square meters: 145.0 m^2
            Average of all villas square meters: 185.0 m^2
            Average of all summerhouses square meters: 220.0 m^2
            Average of  all real estates square meters: 158.33333333333334 m^2
            Real estates that are 2+1: [
            price=497500, squareMeters=145, roomCount=2, livingRoomCount=1,
            price=497500, squareMeters=145, roomCount=2, livingRoomCount=1,
            price=497500, squareMeters=145, roomCount=2, livingRoomCount=1]
        */

    }
}
