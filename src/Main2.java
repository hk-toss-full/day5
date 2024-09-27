import java.util.*;

//22/4
public class Main2 {
    public static void main(String[] args) {
        String[] stu = {"김민석", "김송하", "김현정", "노영현","박서영","서승주","서한승",
        "손지원","양예현","양태양","유윤지","이세연","이승진","이주형","이채민","이현숙"
                ,"조경준","조서연","조예은","최승혁","최창환"
        };
        Queue<String> q = new LinkedList<>(Arrays.asList(stu));

        String[][] team  = new String[4][6];
        while (!q.isEmpty()){
            String poll = q.poll();
            int teamIndex = (int) (Math.random() * 4);
            int teamSecond = (int) (Math.random() * 6);
            try{
                if(team[teamIndex][teamSecond] != null) throw new Exception();
                team[teamIndex][teamSecond] = poll;
            }catch (Exception e){
                q.add(poll);
            }
        }
        System.out.println(Arrays.deepToString(team));

    }
}
