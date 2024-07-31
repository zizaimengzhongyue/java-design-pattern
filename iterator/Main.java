public class Main {

    public static void main(String[] args) {
        ItemList<String> itemList = new ItemList<>();
        itemList.addItem("张三");
        itemList.addItem("李四");
        itemList.addItem("王五");

        Iterator iterator = itemList.getIterator();

        while(iterator.hasNext()) {
            Object name = iterator.next();
            System.out.println(name);
        }
    }

}