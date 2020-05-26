package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Must enter an employer!")
    private String location;

    public Employer () {}

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
