package model;

public class ModelManager implements Model{

    private ItemList itemList;

    public ModelManager(){
        itemList = new ItemList();
    }
    @Override
    public void addItem(Item item) {
        itemList.addItem(item);
        System.out.println("Item added");
    }
}
