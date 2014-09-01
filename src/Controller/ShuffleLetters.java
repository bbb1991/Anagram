package Controller;

import java.util.Arrays;

public class ShuffleLetters {

    public static String shuffleLetters(String randomWord) {

        char[] lettersFromWord = randomWord.toCharArray(); //разбиение слова на массив букв

        Arrays.sort(lettersFromWord); // упорядочивание букв в массиве по алфавиту (единственное разумное решение что пришло на голову)

        return String.valueOf(lettersFromWord);
    }
}
