package view;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Item;
import org.w3c.dom.Text;
import viewmodel.AddItemViewModel;



public class AuctionItemViewController
{
  private ViewHandler viewHandler;
  private Region root;

  private AuctionItemViewModel model;

  @FXML private Label itemLabel;
  @FXML private Button bidButton;
  @FXML private TextField bidNameField;
  @FXML private TextField bidvalueField;
  @FXML private Label errorLabel;

  @FXML private Label timerLabel;

  @FXML private Label quickBuyLabel;
  @FXML private Button quickBuyButton;


  public void init(ViewHandler viewHandler, AuctionItemViewModel model, Region root){
    this.viewHandler = viewHandler;
    this.model = model;
    this.root = root;


    itemLabel.textProperty().bind(viewModel.getItemProperty());
    timerLabel.textProperty().bind(viewModel.getTimerProperty());
    quickBuyLabel.textProperty().bind(viewModel.getQuickBuyProperty());

  }


  public void reset(){

  }

  public Region getRoot(){
    return  root;
  }
}
