public class Builder {
    private String selfIntroduction;
    private String question;
    private String openSpeech;

    public Builder setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
        return this;
    }

    public Builder setQuestion(String question) {
        this.question = question;
        return this;
    }

    public Builder setOpenSpeech(String openSpeech) {
        this.openSpeech = openSpeech;
        return this;
    }


    public Interview Build() {
        Interview interview = new Interview();
        interview.setSelfIntroduction(this.selfIntroduction);
        interview.setQuestion(this.question);
        interview.setOpenSpeech(String.format("%s,%s?", this.selfIntroduction, this.question));
        return interview;
    }

}