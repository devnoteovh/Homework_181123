package ovh.devnote.homework181123;

public class StrangeObject implements Comparable<StrangeObject>{
    private String name;
    //0-99
    private int priority;

    public StrangeObject(String name, int priority) {
        if(priority>99)
            this.priority=99;
        else if(priority<0)
            this.priority=0;
        else
            this.priority=priority;
        this.name = name;
        
    }

    @Override
    public int compareTo(StrangeObject o) {

        return (99-this.priority) - (99-o.getPriority());
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "StrangeObject{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
