import java.util.*;

public class Main {
    public static void main(String[] args) {
        ScheduleManager mgr = ScheduleManager.getInstance();
        TaskFactory f = new TaskFactory();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1.Add 2.Remove 3.View 4.Exit");
            int ch=sc.nextInt(); sc.nextLine();
            if(ch==1){
                System.out.print("Desc: "); String d=sc.nextLine();
                System.out.print("Start: "); String s=sc.nextLine();
                System.out.print("End: "); String e=sc.nextLine();
                System.out.print("Priority: "); String p=sc.nextLine();
                mgr.addTask(f.create(d,s,e,p));
            } else if(ch==2){
                System.out.print("Desc: "); String d=sc.nextLine();
                mgr.removeTask(d);
            } else if(ch==3){
                mgr.view();
            } else break;
        }
    }
}
