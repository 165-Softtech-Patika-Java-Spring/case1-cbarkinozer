import java.math.BigDecimal;
import java.util.ArrayList;

public class Villa extends BaseHouse {

    private static ArrayList<Villa> villaList= new ArrayList<>();

    public Villa() {
        super(BigDecimal.valueOf(850000),185,3,1);
        addVillaList(this);
    }

    public Villa(BigDecimal price, int squareMeters, int roomCount, int livingRoomCount) {
        super(price, squareMeters, roomCount, livingRoomCount);
        addVillaList(this);
    }
    public static ArrayList<Villa> getVillaList(){
        return villaList;
    }
    public static void addVillaList(Villa villa){
        villaList.add(villa);
    }
}
