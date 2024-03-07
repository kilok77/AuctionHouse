package model;

public class Item
{
  private String name;
  private double startingPrice;
  private double quickBuyPrice;
  private boolean sold;
  private double currentBid;

  private AuctionTimer timer;

  public Item(String name,double startingPrice,double quickBuyPrice){
    this.name = name;
    this.startingPrice = startingPrice;
    this.quickBuyPrice = quickBuyPrice;
    this.sold = false;
    this.currentBid = 0.0;
    this.timer = new AuctionTimer();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getStartingPrice()
  {
    return startingPrice;
  }

  public void setStartingPrice(double startingPrice)
  {
    this.startingPrice = startingPrice;
  }

  public double getQuickBuyPrice()
  {
    return quickBuyPrice;
  }

  public void setQuickBuyPrice(double quickBuyPrice)
  {
    this.quickBuyPrice = quickBuyPrice;
  }

  public boolean isSold()
  {
    return sold;
  }

  public void setSold(boolean sold)
  {
    this.sold = sold;
  }

  public double getCurrentBid()
  {
    return currentBid;
  }

  public void setCurrentBid(double currentBid)
  {
    this.currentBid = currentBid;
  }

  public void incrementBid(double bid){
    this.currentBid+=bid;
  }



  @Override public String toString()
  {
    return "Item{" + "name='" + name + '\'' + ", startingPrice=" + startingPrice
        + ", quickBuyPrice=" + quickBuyPrice + ", sold=" + sold
        + ", currentBid=" + currentBid + '}';
  }
}
