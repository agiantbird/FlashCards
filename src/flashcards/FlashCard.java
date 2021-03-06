package flashcards;

public class FlashCard {
    // Instance variables
    private String question;
    private String answer;

    // Constructor
    public FlashCard(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
