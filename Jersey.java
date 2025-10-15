public class Jersey extends BaseballMerch {

private String size;
  private int number;
// No argument
 public Jersey(){
    this.size= "Medium";
   this.number=17;
  }

  
//Parameterized Constructor
public Jersey(String team,double cost,String player, String size, int number){
    super(team,cost,player);
  this.size=size;
  this.number=number;
}
//Accessor Methods
public String getSize(){
  return size;
}
  
public int getNumber(){
  return number;
}

  public String toString(){
    return super.toString() +  ", Size: "+ size + ", Number:" + number;
  }
  
}