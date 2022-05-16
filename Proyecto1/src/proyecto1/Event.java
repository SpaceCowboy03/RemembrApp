package Proyecto1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event extends Activity {
    String location;

    public Event(String name, LocalDate date, LocalTime hour, Priority priority, String label, String location){
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.priority = priority;
        this.label = label;
        this.location = location;
    }
    public Event(String name, LocalDate date, LocalTime hour, Priority priority, String label){
        this(name, date, hour, priority, label, "");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void print(){
        System.out.println("Evento");
        super.print();
        System.out.println("Ubicacion: "+location);
        System.out.println("--------------------------");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Event other = (Event) obj;
        return (name.equals(other.name) && date.equals(other.date) && location.equals(other.location));
    }

    
}
