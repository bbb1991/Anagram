package Controller;

import java.io.*;
import Model.*;
import javax.swing.*;

public class FileReaderClass {
    private static String randomWord;
    public static int indexRandomWord;

// чтение с словаря список слов
    public static String fileReader()  {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("Dictionary/Dictionary.txt").getAbsolutePath()));

            String line;

            while((line = reader.readLine()) != null) {
                Model.allWordsList.add(line);
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Внимание! Файл со словарем не было найдено! \nВозможно, файл был перемещен, " +
                    "либо удален. \nПроверьте, есть в текущем директорий папка 'Dictionary/Dictionary.txt'  \nи повторите попытку снова. " +
                    "А пока, будет загружен демонстрационный словарь \nна тему  'Популярные сериалы'", "Файл не найден!", JOptionPane.WARNING_MESSAGE);
            Model.demonstrationList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // подбор случайного слова из списка
    public static String getRandomWord() {
        indexRandomWord = (int) (Math.random() * Model.allWordsList.size());

        randomWord = Model.allWordsList.get(indexRandomWord);

        return ShuffleLetters.shuffleLetters(randomWord);
    }


    public static String getCurrentString() {
        return randomWord;
    }
}
