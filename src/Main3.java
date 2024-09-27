import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main3 {

    public static void main(String[] args) {
        String[] str = new String[4];
        Queue<String> q = new LinkedList<String>(
                Arrays.asList("미니게임","편의점 타이쿤","펫 키우기","승강기")
        );
        for (int i=0; i< 4; i++){
            int a = (int) (Math.random() * 4);
            String poll = q.poll();
            try {
                if(str[a] != null) throw new Exception();
                str[a] = poll;
            }catch (Exception e){
                q.add(poll);
                i--;
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
