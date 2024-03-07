package viewmodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Item;
import model.Model;

public class AddItemViewModel {
    private Model model;
    private ObservableList<Item> list;

    public AddItemViewModel(Model model){
        this.model = model;
        list = FXCollections.observableArrayList();
    }

    public void addItem(Item item){
        model.addItem(item);
    }
}
