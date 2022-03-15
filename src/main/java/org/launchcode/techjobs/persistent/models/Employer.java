package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Required field")
    @Size(max = 50, message = "This field cannot exceed 50 characters.")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
