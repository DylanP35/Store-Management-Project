import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

BaseballMerch bundle = new BaseballMerch("Dodgers", 99.99, "Ohtani");
BaseballMerch Jerseys = new Jersey("Dodgers", 59.99,"Ohtani","Medium",17);
BaseballMerch Bats = new Bat("Dodgers", 59.99,"Ohtani", 30,28);


System.out.println("Bundle:" + bundle);
System.out.println("Jersey:" + Jerseys);
System.out.println("Bat:" + Bats);


    input.close();
    
  }
}