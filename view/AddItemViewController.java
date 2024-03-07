package view;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import model.Item;
import viewmodel.AddItemViewModel;

public class AddItemViewController {
    private ViewHandler viewHandler;
    private Region root;
    private AddItemViewModel model;

    public void init(ViewHandler viewHandler, AddItemViewModel  model, Region root) {
        this.viewHandler = viewHandler;
        this.model = model;
        this.root = root;
    }

    public void reset(){

    }
    @FXML
    private void addItem(){
        model.addItem(new Item("name",90,1000));
    }

    public Region getRoot() {
        return root;
    }
}
