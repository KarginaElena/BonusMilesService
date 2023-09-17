public class BonusMilesService {

    public int calculate(int cost) {
        int mileValue = 20;

        int miles = cost / mileValue;
        return miles;
    }
}
