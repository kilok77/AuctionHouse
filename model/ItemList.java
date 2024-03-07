package model;

import java.util.ArrayList;

public class ItemList
{
  private ArrayList<Item> items;

  public ItemList(){
    this.items = new ArrayList<>();
  }

  public ArrayList<Item> getItems()
  {
    return items;
  }


  public void addItem(Item item){
    items.add(item);
  }

  public Item getItem(int index){
    return items.get(index);
  }

  public void removeItem(Item item){
    items.remove(item);
  }

  @Override public String toString()
  {
    return "ItemList{" + "items=" + items + '}';
  }
}
