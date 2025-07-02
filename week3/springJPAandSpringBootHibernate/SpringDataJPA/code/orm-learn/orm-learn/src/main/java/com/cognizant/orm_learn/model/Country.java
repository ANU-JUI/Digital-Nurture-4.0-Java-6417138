package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
@Table(name="country")
public class Country {

    @Id
    @Column(name="co_code")
    private String code;

    @Column(name="co_name")
    private String name;

    void setCode(String code) {
        this.code = code;
    }   
    public String getCode() {     
        return code;
    }
    void setName(String name) {
        this.name = name;
    }
    public String getName() {   
        return name;
    }
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }

}
