import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String name;
    int num;
    double gasPrice;
    boolean sunny;
    System.out.println("What's your name?");
    name = s.nextLine();
    System.out.println("Hi there, " + name + ", what's your favorite number (type a whole number)");
    num = s.nextInt();
    switch (num) {
      case 8:
        System.out.println(name + ", " + num + " is my favorite number too");
        break;
      case 11:
        System.out.println(num + " is my girlfriend's favorite number");
        break;
      default:
        System.out.println(num + " is a nice number");
    }

    System.out.println("What is the gas price in your neighborhood? Type a decimal number");
    gasPrice = s.nextDouble();
    if (gasPrice <= 3.0)
      System.out.println("Wow, $" + gasPrice + " isn't too bad");
    else if (gasPrice > 3 && gasPrice < 4)
      System.out.println("$" + gasPrice + " ! Prices are going up");
    else 
      System.out.println("Wow, $" + gasPrice + "!! That's highway robbery");

    system.out.println("Is it sunny for you today? Type true or false");
    sunny = s.nextBoolean();
    if (sunny == true)
      System.out.println(name + ", that's great! I love sunny weather");
    else 
      System.out.println("Too bad, " + name + ", hopefully the sun will come out tomorrow");
  }
}