package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
        //added
//        this.name = "";
//        this.employer = new Employer;
//        this.location = new Location();
//        this.positionType = new PositionType();
//        this.coreCompetency = new CoreCompetency();
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String result = "\nID:" + id ;

//        result += "\nName:" + name == "" ? name :  "Data not available";
//        result += "\nEmployer:" + employer.getValue() == ""? name :  "Data not available";
//        result += "\nLocation:" + location.getValue() == ""? location :  "Data not available";
//        result += "\nLocation:" + positionType.getValue() == ""? positionType :  "Data not available";
//        result += "\nCoreCompetency:"+ coreCompetency.getValue() == ""? coreCompetency :  "Data not available";
//
//        result += "\n";

        //return result;
        if(name.equals("")){
            name =  "Data not available";
        }
        if(employer.getValue().equals("")){
            employer = new Employer("Data not available") ;
        }
        if(location.getValue().equals("")){
            location = new Location("Data not available");
        }
        if(positionType.getValue().equals("")){
            positionType =  new PositionType("Data not available");
        }
        if(coreCompetency.getValue().equals("")){
            coreCompetency =  new CoreCompetency("Data not available");
        }

            return "\nID:" + id +
                    "\nName:" + name +
                    "\nEmployer:" + employer +
                    "\nLocation:" + location +
                    "\nPositionType:" + positionType +
                    "\nCoreCompetency:" + coreCompetency +
                    "\n";

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
