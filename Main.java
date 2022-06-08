import java.util.Scanner;
import java.io.*;

public class Main extends Thread {
  public static void main(String[] args) {
    try {
      File importFile=new File("reading.txt");
      try (Scanner sc = new Scanner(importFile)) {
        while(sc.hasNextLine()){
            String str_2=sc.nextLine();
            System.out.println(str_2);
        }
      }
    } catch (Exception e) {
    }
  }
}