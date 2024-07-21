import java.util.ArrayList;
import java.util.Collections;

public class sevenJobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public String toString() {
            return "Job [id=" + id + ", deadline=" + deadline + ", profit=" + profit + "]";
        }
    }
    public static void main(String[] args) {
        int[][] jobs_to_perform = {{4,20},{1,20},{1,30},{1,10}};

        //make a arraylist which stores all the job making same format
        ArrayList<Job> jobs = new ArrayList<Job>();
        for(int i=0; i<jobs_to_perform.length; i++){
            jobs.add(new Job(i,jobs_to_perform[i][0] ,jobs_to_perform[i][1]));
        }
        System.out.println(jobs);
        //desceding sort on based of profit
        Collections.sort(jobs,(a,b) ->{return b.profit - a.profit; });
        System.out.println(jobs);

        int time=0;
        //stores all the jobs id
        ArrayList<Integer> seqIntegers = new ArrayList<>();
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline >= time){
                time++;
                seqIntegers.add(curr.id);
            }
        }
        System.out.println(time);
        System.out.println(seqIntegers);
    }
    
}
