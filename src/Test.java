import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String input="aabbbcccd";
       boolean [] visited=new boolean[input.length()];
        Arrays.fill(visited,false);
        System.out.println(Arrays.toString(visited));
        for(int i=0;i<input.length();i++){
            if(visited[i]==true) {
                continue;
            }
            //count Fre
            int count = 1;
            for(int j=i+1;j<input.length();j++){
                if(input.charAt(j)==input.charAt(i)){
                    visited[j]=true;
                    count++;
                }
              //  System.out.print(input.charAt(i)+ "" + count);


            }
            System.out.print(input.charAt(i)+ "" + count);
        }
    }
}
