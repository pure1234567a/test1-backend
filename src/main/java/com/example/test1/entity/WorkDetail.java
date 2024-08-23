package com.example.test1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "work_detail")
@Getter
@Setter
public class WorkDetail {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="position")
    private String position;

    @Column(name="department")
    private String department;

    @Column(name="start_date")
    private String startDate;

    @Column(name="terminate_date")
    private String terminateDate;
}
