import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.EOFException;
import java.io.File;

public class Main {

  public static void main(String[] args) {
    try {
      File samplFile = new File("sample.txt");
      Scanner sc = new Scanner(samplFile);
      while(sc.hasNext()) {
        String data = sc.next();
        System.out.println(data);
      }
      sc.close();
    } catch (Exception e) {
      System.out.println("An error ocurred");
      e.printStackTrace();
    }
  }
}