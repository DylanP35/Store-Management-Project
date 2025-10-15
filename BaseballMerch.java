public class BaseballMerch {
    private String team;
  private double cost;
  private String player;

  //No argument constructors
  public BaseballMerch(){
    this.team= "Dodgers";
    this.cost=99.99;
    this.player="Ohtani";
  }




//Parameterized Constructor
public BaseballMerch(String team,double cost, String player){
  this.team=team;
this.cost=cost;
  this.player= player;
}

public String getTeam(){
  return team;
}

public double getCost(){
  return cost;
}
  public String getPlayer(){
    return player;
  }
// toString method
public String toString() {
  return " Team:"+ team + ", Cost: $" + cost + " Player: " + player;
}
//set methods
public void setTeam(String team){
  this.team= team;
}
public void setCost(double cost){
  this.cost= cost;
}
public void setPlayer(String player){
  this.player = player;
}

  
  
}