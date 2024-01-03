import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        FoodWaste fW = new FoodWaste();
        //initialisere udløbsdato
        LocalDate saleByDate = LocalDate.of(2024,1,15);
        System.out.println("Food waste box? ");
        //0=3
        //1=1
        //2=14
        //3=2
        //4=5
        System.out.println("Kategori 0: "+ fW.checkDate(0, saleByDate));
        System.out.println("Kategori 1: "+ fW.checkDate(1, saleByDate));
        System.out.println("Kategori 2: "+ fW.checkDate(2, saleByDate));
        System.out.println("Kategori 3: "+ fW.checkDate(3, saleByDate));
        System.out.println("Kategori 4: "+ fW.checkDate(4, saleByDate));
    }
}