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

        System.out.println(HouseService.filterAllByRoomCount(2,1).toString());
    }
}
