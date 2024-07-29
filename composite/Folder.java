import java.util.ArrayList;
import java.util.List;

public class Folder implements FS {
    private String name;
    private List<FS> items = new ArrayList<>();


    public Folder(String name) {
        this.name = name;
    }

    public void add(FS fs) {
        this.items.add(fs);
    }

    public void remove(FS fs) {
        this.items.remove(fs);
    }

    public FS getChild(int index) {
        return this.items.get(index);
    }

    public void getMeta() {
        System.out.printf("这是一个文件夹,文件夹名称:%s,包含 %d 个文件\n",this.name, this.items.size());
    }
}