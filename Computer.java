public class Computer {
      public static final int WIRED = 1;
      public static final int WIFI = 2;
      public static final int LTE = 3;
      private String brand;
      private String os;
      private int ram;
      private boolean online;
      private int network;
      
      public Computer(String brand1, String os1, int ram1,
                  boolean online1, int network1) {
        brand = brand1;
        os = os1;
        ram = ram1;
        online = online1;
        network = network1;
      }
      
        public String getBrand() { return brand; }
        public String getOS() { return os; }
        public int getRAM() { return ram; }
        public boolean getOnline() { return online; }
        public int getNetwork() { return network; }
        public void setBrand(String brand1) { brand = brand1; }
        public void setOS(String os1) { os = os1; }
        public void setRAM(int ram1) { ram = ram1; }
        public void setOnline(boolean online1) { online = online1; }
        public void setNetwork(int network1) { network = network1; }
        
      public String toString() {
        return (online) ?
        "Brand: " + brand + ", OS: " + os + ", RAM: " + ram +
        "GB, Network: " + network :
        "Brand: " + brand + ", OS: " + os + ", RAM: " + ram + "GB";
      }
  }    