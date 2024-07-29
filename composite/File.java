public class File implements FS{

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void add(FS fs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(FS fs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public FS getChild(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void getMeta() {
        System.out.printf("这是一个文件，文件名称是: %s\n", this.name);
    }
}
