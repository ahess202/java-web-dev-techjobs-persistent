package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Must enter an employer!")
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer () {}

    public Employer(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
