//This question involves the implementation of a fitness tracking system
// that is represented by the StepTracker class. A StepTracker object is
// created with a parameter that defines the minimum number of steps that
// must be taken for a day to be considered active.
//
//The StepTracker class provides a constructor and the following methods.
//
//addDailySteps, which accumulates information about steps,
// in readings taken once per day activeDays, which returns
// the number of active days averageSteps, which returns
// the average number of steps per day, calculated by dividing
// the total number of steps taken by the number of days tracked
//
//The following table contains a sample code execution sequence and the corresponding results.

public class StepTracker {
    private int totalSteps;
    private int Days;
    private int activeDays;
    private final int StepsForActiveDay;
    public StepTracker(int x){
        totalSteps=0;
        Days=0;
        StepsForActiveDay=x;
        activeDays=0;
    }

    public int getActiveDays(){
        return activeDays;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public int getStepsForActiveDay() {
        return StepsForActiveDay;
    }

    public int getDays() {
        return Days;
    }

    public void addDailySteps(int x){
        totalSteps += x;
        Days++;
        if (x>=StepsForActiveDay){
            activeDays++;
        }
    }
    public double averageSteps(){
        if (Days == 0){
            return 0.0;
        }
        return ((double) totalSteps/Days);
    }

    public int activeDays(){
        return activeDays;
    }
}
