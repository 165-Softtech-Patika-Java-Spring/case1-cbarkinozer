public class HouseFactory {
    public BaseHouse produceHouse(){
        if(HouseDAO.houseType.equalsIgnoreCase("House")){
            return new House(HouseDAO.price, HouseDAO.squareMeters, HouseDAO.roomCount, HouseDAO.livingRoomCount);
        }else if(HouseDAO.houseType.equalsIgnoreCase("Villa")){
            return new Villa(HouseDAO.price, HouseDAO.squareMeters, HouseDAO.roomCount, HouseDAO.livingRoomCount);
        }else if(HouseDAO.houseType.equalsIgnoreCase("Summerhouse")){
            return new Summerhouse(HouseDAO.price, HouseDAO.squareMeters, HouseDAO.roomCount, HouseDAO.livingRoomCount);
        }else{
            return null;
        }
    }
}
