package com.example.test1.repository;

import com.example.test1.entity.PersonalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetailRepository extends JpaRepository<PersonalDetail, String> {

    public PersonalDetail save(PersonalDetail personalDetail);
    public PersonalDetail findById(Sting id);

}
