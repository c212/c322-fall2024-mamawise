import java.util.ArrayList;
public class RandomStringGenerator {
    //required from book
    public ArrayList<Range> rangeList = new ArrayList<Range>();
    public void addRange(char first, char last) {
      this.rangeList.add(new Range(first, last));
    }
    public String nextString(int length) { // they asked for this method specifically 
      String output = ""; /
      for (int i = 0; i < length; i++) { 
        int index = ((int) (Math.random() * this.rangeList.size()));  
        output = output + this.rangeList.get(index).getChar(); 
      }
      return output;  
    }
    public static void main(String[] args) { 
      RandomStringGenerator generator = new RandomStringGenerator();  
      generator.addRange('a', 'z'); 
      generator.addRange('A', 'Z');  
      generator.addRange('0', '9');  
      String s = generator.nextString(Interger.parseInt(args[0]));
      System.out.println(generator.nextString(howeverMany)); 
    }
  }