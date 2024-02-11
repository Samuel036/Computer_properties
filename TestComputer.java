public class TestComputer {
  public static void main(String[] args) {
      
    Computer computer1 =
        new Computer("Akiba", "Win", 16, false, Computer.WIRED);
    Computer computer2 =
        new Computer("Bamica", "Mac", 32, true, Computer.WIFI);
    ComputerLaptop computer3 =
        new ComputerLaptop("Cavida", "Mac", 8, true, Computer.LTE, 1300,
                              new String[] { "Gold", "Silver", "Pink" });
                              
    System.out.println(computer1.toString());
    System.out.println(computer2.toString());
    System.out.println(computer3.toString());
  }
}