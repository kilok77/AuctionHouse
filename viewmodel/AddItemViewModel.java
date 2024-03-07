package viewmodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AddItemViewModel {
    private Module model;

    private ObservableList<Item> list;

    public AddItemViewModel(){
        this.model = model;
        items = FXCollections.observableArrayList();
    }

    public void addItem(Item item){
        model.addItem(item);
    }
}
