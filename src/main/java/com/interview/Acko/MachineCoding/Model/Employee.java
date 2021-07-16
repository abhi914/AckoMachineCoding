package com.interview.Acko.MachineCoding.Model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Employee {
    private String id;

    public Employee() {}

    public Employee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
