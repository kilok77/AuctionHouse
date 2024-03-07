package view;

import javafx.fxml.FXML;
import viewmodel.AddItemViewModel;

import javax.swing.plaf.synth.Region;

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
        model.addItem();
    }
}
