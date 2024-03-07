package model;

import java.util.Timer;
import java.util.TimerTask;

public class AuctionTimer
{
  private Timer timer;
  private long durationInMillis;

  public AuctionTimer(){
    this.durationInMillis = 0;
    this.timer  = new Timer(true);
  }

  public void startAuction(long durationInMillis){
    TimerTask endAuctionTask = new TimerTask()
    {
      @Override public void run()
      {
        endAuction();
      }
    };

    timer.schedule(endAuctionTask,durationInMillis);
    System.out.println("Auction started. Bidding is now open");
  }


  private void endAuction(){

  }
}



