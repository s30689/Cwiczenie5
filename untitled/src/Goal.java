import java.time.LocalDate;

public class Goal{
    int goalYear;
    int goalDay;
    int goalMonth;
    String goalGoal;
    int goalReward;
    LocalDate dzis = LocalDate.now();
    int currentMonth = dzis.getMonthValue();
    int currentYear = dzis.getYear();

    int premia;


    public Goal(int goalYear, int goalDay, int goalMonth, String goalGoal, int goalReward){};


    public void completedGoal(){
        if (goalMonth==currentMonth && goalYear == currentYear){
            premia=goalReward;
        }

    }



}