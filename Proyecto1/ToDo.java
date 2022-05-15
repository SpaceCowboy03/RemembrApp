package Proyecto1;

import java.time.LocalDate;
import java.time.LocalTime;

public class ToDo extends Activity {
    String description;

    public ToDo(String name, LocalDate date, LocalTime hour, Priority priority, String label, String description){
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.priority = priority;
        this.label = label;
        this.description = description;
    }

    public ToDo(String name, LocalDate date, LocalTime hour, Priority priority, String label){
        this(name, date, hour, priority, label, "");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void print(){
        System.out.println("ToDo");
        super.print();
        System.out.println("Descripcion: "+description);
        System.out.println("--------------------------");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        ToDo other = (ToDo) obj;
        return (name.equals(other.name) && date.equals(other.date) && description.equals(other.description));
            
    }


    

    
}
