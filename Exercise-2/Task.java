public class Task {
    String desc;
    String start;
    String end;
    String priority;

    Task(String d,String s,String e,String p){
        desc=d; start=s; end=e; priority=p;
    }

    public String toString(){
        return start+" - "+end+": "+desc+" ["+priority+"]";
    }
}
