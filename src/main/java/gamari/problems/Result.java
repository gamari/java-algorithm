package gamari.problems;

public class Result {
    private String answer;

    public Result() {
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void printStack() {
        System.out.println(this.answer);
    }
}
