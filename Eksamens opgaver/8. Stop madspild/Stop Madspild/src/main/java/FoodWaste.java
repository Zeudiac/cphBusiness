import java.time.LocalDate;

public class FoodWaste {
    private int[] limits = {3,1,14,2,5};
    public boolean checkDate(int category, LocalDate saleByDate){
        //finder datoen for hvornår maden skal i foodwaste
        LocalDate stopFoodWasteDate = saleByDate.minusDays(limits[category]);
        //returnere om datoen er overskredet
        return stopFoodWasteDate.isBefore(LocalDate.now());
    }

}
