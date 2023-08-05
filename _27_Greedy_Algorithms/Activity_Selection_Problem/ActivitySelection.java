package _27_Greedy_Algorithms.Activity_Selection_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
    public static void activitySelection(ArrayList<Activity> activityList){
        Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };

        Collections.sort(activityList, finishTimeComparator); //List.sort also works

        Activity previousActivity = activityList.get(0);
        System.out.println("Recommended Schedule:\n" + activityList.get(0));

        for(int i = 1; i < activityList.size(); i++){
            Activity currentActivity = activityList.get(i);

            if(currentActivity.getStartTime() >= previousActivity.getFinishTime()){
                System.out.println(currentActivity);
                previousActivity = currentActivity;
            }
        }
    }
}