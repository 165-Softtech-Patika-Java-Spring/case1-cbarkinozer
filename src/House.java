import java.math.BigDecimal;
import java.util.ArrayList;

public class House extends BaseHouse {

    private static ArrayList<House> houseList= new ArrayList<>();

    public House(){
        super(BigDecimal.valueOf(497500),145,2,1);
        addHouseList(this);
    }

    public House(BigDecimal price, int squareMeters, int roomCount, int livingRoomCount){
        super(price, squareMeters, roomCount, livingRoomCount);
        addHouseList(this);
    }

    public static ArrayList<House> getHouseList(){
        return houseList;
    }
    public static void addHouseList(House house){
        houseList.add(house);
    }
}
