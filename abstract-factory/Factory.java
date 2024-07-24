public class Factory {
    public static Interview getInstance(String career) {
        if (career == "coder") {
            return new Coder();
        }
        return new Sales();
    }
}