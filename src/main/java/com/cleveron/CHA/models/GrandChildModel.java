package com.cleveron.CHA.models;

import javax.persistence.*;

@Entity
public class GrandChildModel {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double id;
    @ManyToOne
    private ChildModel childModel;

}
