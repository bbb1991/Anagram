package Controller;

import View.GUI;
import Model.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners {


    public static class CheckButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (FileReaderClass.getCurrentString().equalsIgnoreCase(GUI.getUserInput())) {

                GUI.setIsGuessed("Вы угадали!");
                Model.allWordsList.remove(FileReaderClass.indexRandomWord);

                //проверка на остаток слов
                if (Model.allWordsList.isEmpty()) {
                    try {
                        throw new AllWordsCompletedException();
                    } catch (AllWordsCompletedException e1) {
                        JOptionPane.showMessageDialog(null, "We have a winner! Congratulations!", "You win!",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            } else {
                GUI.setIsGuessed("Попробуйте еще раз");
            }
        }
    }

    public static class NextButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String randomWord = FileReaderClass.getRandomWord();
            GUI.setShuffledWordField(randomWord);

        }
    }


}
