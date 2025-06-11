package Algorithms.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity{
    int start, finish;
    Activity(int start , int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelection {
    static class ActivityComparator implements Comparator<Activity>{
        public int compare(Activity a1,Activity a2){

            return a1.finish-a2.finish;
        }
    }

    static void printMaxAcivities(List<Activity> activities){
        activities.sort(new ActivityComparator());
        int lastSecelted = 0;
        System.out.print("(" + activities.get(lastSecelted).start+ "," + activities.get(lastSecelted).finish+ ")");

        for (int i =0;i<activities.size();i++){
            if(activities.get(i).start >= activities.get(lastSecelted).finish){
                System.out.print("(" + activities.get(i).start+ "," + activities.get(i).finish+ ")");
                lastSecelted=i;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5,7),
                new Activity(8,9),
                new Activity(1,4),
                new Activity(5,9),
                new Activity(0,6),
                new Activity(3,5));
        printMaxAcivities(activities);
    }
}
