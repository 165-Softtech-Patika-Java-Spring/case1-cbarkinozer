public class HouseFactory {
    public BaseHouse produceHouse(){
        if(HouseDTO.houseType.equalsIgnoreCase("House")){
            return new House(HouseDTO.price, HouseDTO.squareMeters, HouseDTO.roomCount, HouseDTO.livingRoomCount);
        }else if(HouseDTO.houseType.equalsIgnoreCase("Villa")){
            return new Villa(HouseDTO.price, HouseDTO.squareMeters, HouseDTO.roomCount, HouseDTO.livingRoomCount);
        }else if(HouseDTO.houseType.equalsIgnoreCase("Summerhouse")){
            return new Summerhouse(HouseDTO.price, HouseDTO.squareMeters, HouseDTO.roomCount, HouseDTO.livingRoomCount);
        }else{
            return null;
        }
    }
}
