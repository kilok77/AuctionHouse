import model.Item;
import model.ItemList;

import java.util.Scanner;

public class ItemTest
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    ItemList itemList = new ItemList();

    while(true){
      System.out.println("Please enter name of item");
      String name = in.nextLine();
      double startingPrice = 0;
      boolean valid = false;
      while(!valid){
        System.out.println("Please enter starting price");
        try{
          startingPrice =Double.parseDouble(in.nextLine());
        }catch (Exception e){
          System.out.println("invalid input" + e.getMessage());
        }
      }
    }
  }
}
