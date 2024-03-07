package model;

public class ModelManager implements Model{

    private ItemList itemList;
    @Override
    public void addItem(Item item) {
        itemList.addItem(item);
    }
}
