package com.Sesion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

public class Activity implements Comparator<Activity> {
    String name;
    LocalDate date; // 
    LocalTime hour; // formatter
    Priority priority;
    String label; // categoria

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void print() {
        System.out.println("Actividad: " + name + " \nFecha: " + date + " Hora: " + hour + " \nPrioridad: " + priority
                + " \nEtiqueta: " + label);
    }

    @Override
    public int compare(Activity o1, Activity o2) {
        if ((o1.getDate().compareTo(o2.getDate())) != 0) {
            return (o1.getDate().compareTo(o2.getDate()));
        }
        if ((o1.getPriority().compareTo(o2.getPriority())) != 0) {
            return (o1.getPriority().compareTo(o2.getPriority()));
        }
        if ((o1.getName().compareTo(o2.getName()))  != 0) {
            return (o1.getName().compareTo(o2.getName()));
        }
        return 0;

    } // si 1<2 negativo, si 1=2 cero, si 1>2 positivo

}
