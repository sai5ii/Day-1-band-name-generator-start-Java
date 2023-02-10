import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Welcome to the Band Name Generator");
    Scanner myReader = new Scanner(System.in);
    System.out.println("What's the name of the city you grew up in?");
    String city = myReader.nextLine();
    
    System.out.println("What's your pet's name?");
    String pet = myReader.nextLine();

    System.out.println("Your band name could be " + city + " " + pet);
      
  }
}