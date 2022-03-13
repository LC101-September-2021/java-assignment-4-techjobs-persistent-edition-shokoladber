package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job{

    @Id
    @GeneratedValue
    private int id;

    //TODO
    //add validation annotations, i.e. @valid(min, max)
    private String name;

    //TODO
    //add validation annotations
    //add ORM annotations and mapping to connect these Strings (employer, skills) to their classes
    // for example, @OneToMany(mappedBy = "Employer")
    private String employer;
    private String skills;

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
