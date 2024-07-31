public abstract class Interview {

    public final void interview() {
        firstRound();
        secondRound();
        thirdRound();
    }

    public abstract void firstRound();

    public abstract void secondRound();

    public abstract void thirdRound();

}