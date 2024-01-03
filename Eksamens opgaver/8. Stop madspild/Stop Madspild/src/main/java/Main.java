import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        FoodWaste fW = new FoodWaste();
        //initialisere udløbsdato
        LocalDate saleByDate = LocalDate.of(2024,1,7);
        System.out.println("Food waste box? ");

        //Kategorier og deres limits:
        //0=3
        //1=1
        //2=14
        //3=2
        //4=5

        //Metode kald kategori 0 (FoodWaste.checkDate)
        System.out.println("Kategori 0: "+ fW.checkDate(0, saleByDate));

        //Metode kald kategori 1 (FoodWaste.checkDate)
        System.out.println("Kategori 1: "+ fW.checkDate(1, saleByDate));

        //Metode kald kategori 2 (FoodWaste.checkDate)
        System.out.println("Kategori 2: "+ fW.checkDate(2, saleByDate));

        //Metode kald kategori 3 (FoodWaste.checkDate)
        System.out.println("Kategori 3: "+ fW.checkDate(3, saleByDate));

        //Metode kald kategori 4 (FoodWaste.checkDate)
        System.out.println("Kategori 4: "+ fW.checkDate(4, saleByDate));
    }
}