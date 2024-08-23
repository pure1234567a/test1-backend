package com.example.test1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personal_detail")
@Getter
@Setter
public class PersonalDetail {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="id_card")
    private String idCard;

    personalDetail
    @Column(name="mobile_no")
    private String mobileNo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    private WorkDetail workDetail;
}
