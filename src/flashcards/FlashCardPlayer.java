package flashcards;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FlashCardPlayer {
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private Iterator cardIterator;
    private FlashCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private boolean isShowAnswer;

    public FlashCardPlayer() {
        // Build UI

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardPlayer();
            }
        });
    }
}
