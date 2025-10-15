public class Bat extends BaseballMerch {

private int length;
  private int weight;

// No argument consturctor
   public Bat(){
    this.length = 30;
     this.weight = 28;
  }
  
//Parameterized Constructor
public Bat(String team, double cost, String player, int length, int weight){
  super(team,cost,player);
this.length=length;
this.weight=weight;
}

// Accessor Methods
public int getLength(){
  return length;
}

  public int getWeight(){
  return weight;
}
  
   public String toString(){
    return super.toString() +  ", Length:"+ length + ", Weight:" + weight;
  }
  
}