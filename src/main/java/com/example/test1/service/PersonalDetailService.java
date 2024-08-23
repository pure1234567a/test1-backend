package com.example.test1.service;
import java.util.Optional;

import com.example.test1.entity.PersonalDetail;
import com.example.test1.repository.PersonalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailService {

    @Autowired
    private PersonalDetailRepository personalDetailRepository;

    public PersonalDetail savePersonalDetail(PersonalDetail personalDetail) {
        return personalDetailRepository.save(personalDetail);
    }

    public PersonalDetail findById(PersonalDetail req) {
        Optional<PersonalDetail> personalDetail = personalDetailRepository.findById(req.getId());

        if (personalDetail.isEmpty()) {
            throw new RuntimeException("Personal Detail not found");
        }

        return personalDetail.get();
    }

    public PersonalDetail updatePersonalDetail(PersonalDetail req) {
        Optional<PersonalDetail> pddb = personalDetailRepository.findById(req.getId());

        if (pddb.isEmpty()) {
            throw new RuntimeException("Personal Detail not found");
        }

        PersonalDetail exst = pddb.get();
        exst.setName(req.getName());
        exst.setIdCard(req.getIdCard());
        exst.setBirthDate(req.getBirthDate());
        exst.setMobileNo(req.getMobileNo());

        return personalDetailRepository.save(exst);
    }

}
