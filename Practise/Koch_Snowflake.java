import java.util.Scanner;

public class Koch_Snowflake {

  public static int Generation(int n, int i){
      if (n > 0){
        int group = i%4;
        if (group == 2 || group == 3){ return n; }
        else {
          int groupNum;
          if (group == 1) { groupNum = (i+3)/4; }
          else{ groupNum = i/4;}
          return Generation(n-1, groupNum);
        }
      }
      else { return 0;}
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      while(in.hasNext()) {
        int i = in.nextInt();
        int n = in.nextInt();
        int result = Generation(n,i);
        System.out.println(result);
      }
  }
}
