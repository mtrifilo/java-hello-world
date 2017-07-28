import java.util.TimerTask;
import java.util.Timer;

public class TaskMaster extends TimerTask {
    String strObject;

    public TaskMaster (String strObject) {
        this.strObject = strObject;
    }

    public void run() {
        System.out.println("Inside Run task-" + strObject);
    }
}

class JavaTimer {
    Timer timer_1;

    Timer timer_2;

    public JavaTimer (int t1, int t2) {
        timer_1 = new Timer();
        timer_2 = new Timer();

        timer_1.schedule(new TaskMaster("Alpha"), t1 * 1000, t1 * 1000);
        timer_2.schedule(new TaskMaster("Beta"), t2 * 1000, t2 * 1000);
    }

    public static void main(String args[]) {
        new JavaTimer(1, 5);
    }
}