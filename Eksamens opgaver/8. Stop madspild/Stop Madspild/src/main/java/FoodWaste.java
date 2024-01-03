import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class FoodWaste {
    private int[] limits = {3,1,14,2,5};
    public boolean checkDate(int category, LocalDate saleByDate){
        //finder datoen som maden skal i foodwaste
        LocalDate stopFoodWasteDate = saleByDate.minusDays(limits[category]);
        //returnere om datoen er overskredet
        return stopFoodWasteDate.isBefore(LocalDate.now());
    }

}
