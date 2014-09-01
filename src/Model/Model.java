package Model;

import java.util.ArrayList;

/**
 * В данном классе хранится словари
 */

public class Model {

    //Считанные файлы помещаются в этот список
    public static ArrayList<String> allWordsList = new ArrayList<String>();

    //загрузка пробных слов для демонстраций
    public static void demonstrationList() {
        allWordsList.add("sherlock");
        allWordsList.add("supernatural");
        allWordsList.add("castle");
        allWordsList.add("bones");
    }

}
