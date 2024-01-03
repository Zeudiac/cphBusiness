import java.util.ArrayList;

import static java.util.Collections.replaceAll;

public class Main {
    public static void main(String[] args) {

        StringHandler sH = new StringHandler();

        ArrayList<String> students = new ArrayList<>();
        students.add("Anders");
        students.add("Katrine");
        students.add("Joakim");
        students.add("Stine");

        ArrayList<String> genders = new ArrayList<>();
        genders.add("han");
        genders.add("hun");

        System.out.println(sH.replaceText("Katrine trak sit spørgsmål kl. 10. hun fik karakteren 7. Anders trak sit spørgsmål kl. 11. han fik karakteren 4",students,genders));

    }
}