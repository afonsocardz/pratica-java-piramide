import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o número de início");
    int startNumber = input.nextInt();
    
    System.out.println("Digite o número de fim");
    int finalNumber = input.nextInt();
    input.close();

    for(int i = startNumber; i <= finalNumber; i++){
      StringBuilder line = new StringBuilder();
      for(int j = 0; j < i; j++){
        line.append(i);
      }
      System.out.println(line.toString());
    }
  }
}
