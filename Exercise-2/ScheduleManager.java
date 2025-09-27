import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks = new ArrayList<>();

    private ScheduleManager(){}

    public static ScheduleManager getInstance(){
        if(instance==null) instance=new ScheduleManager();
        return instance;
    }

    public boolean addTask(Task t){
        for(Task x: tasks){
            if(x.start.equals(t.start) || x.end.equals(t.end)){
                System.out.println("Error: conflict with "+x.desc);
                return false;
            }
        }
        tasks.add(t);
        System.out.println("Task added: "+t.desc);
        return true;
    }

    public void removeTask(String d){
        boolean found=false;
        for(Task x: new ArrayList<>(tasks)){
            if(x.desc.equals(d)){ tasks.remove(x); found=true; break; }
        }
        if(found) System.out.println("Removed: "+d);
        else System.out.println("Error: Task not found");
    }

    public void view(){
        if(tasks.isEmpty()){ System.out.println("No tasks scheduled."); return; }
        tasks.sort((a,b)->a.start.compareTo(b.start));
        for(Task t: tasks) System.out.println(t);
    }
}
