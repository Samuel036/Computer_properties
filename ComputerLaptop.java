public class ComputerLaptop extends Computer {
    
  private int weight;
  private String[] colorVariations;
  
  public ComputerLaptop(String brand1, String os1,
                        int ram1, boolean online1,
                        int network1, int w, String[] cv) {
    super(brand1, os1, ram1, online1, network1);
    setWeight(w);
    setColorVariations(cv);
  }
  
  public int getWeight() { return weight; }
  public void setWeight(int w) { weight = w; }
  
  public String[] getColorVariations() {
    String[] retArr = new String[colorVariations.length];
    for(int i=0; i<colorVariations.length; i++)
      retArr[i] = colorVariations[i];
    return retArr;
  }
  
  public void setColorVariations(String[] cv) {
    colorVariations = new String[cv.length];
    for(int i=0; i<cv.length; i++)
      colorVariations[i] = cv[i];
  }
  
  public String toString() {
    String str = super.toString() + ", Weight: " + weight + "g, [ ";
    for(int i=0; i<colorVariations.length; i++)
      str += (colorVariations[i] +
             ((i != colorVariations.length - 1) ? (", "): ""));
    return str + " ]";
  }
  
}