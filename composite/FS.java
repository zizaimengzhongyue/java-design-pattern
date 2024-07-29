public interface FS {
    public void add(FS fs);
    public void remove(FS fs);
    public FS getChild(int index);
    public void getMeta();
}