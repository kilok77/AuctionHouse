package viewmodel;

import model.Model;

public class ViewModelFactory {
    private AddItemViewModel addItemViewModel;
    private Model model;

    public ViewModelFactory(Model model){
        this.model = model;
        this.addItemViewModel = new AddItemViewModel(model);
    }

    public AddItemViewModel getAddItemViewModel() {
        return addItemViewModel;
    }
}
