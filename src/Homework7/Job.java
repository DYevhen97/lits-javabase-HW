package Homework7;

public enum Job {
FEEDER("F"),
    CLEANER("C"),
    ACCOUNTANT("A");

private String name;

Job (String name) { this.name = name;}
public String getName () { return name;}

public static Job findByName(String name) {
for(Job j: Job.values()) {
    if(j.getName().equals(name)) {
        return j;
    }
}
throw new IllegalArgumentException();
}
}
