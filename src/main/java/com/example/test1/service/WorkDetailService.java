package com.example.test1.service;

import com.example.test1.entity.WorkDetail;
import com.example.test1.repository.WorkDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkDetailService {

    @Autowired
    private WorkDetailRepository workDetailRepository;

    public WorkDetail saveWorkDetail(WorkDetail workDetail) {
        return workDetailRepository.save(workDetail);
    }

    public WorkDetail updatePWorkDetail(WorkDetail req) {
        Optional<WorkDetail> wddb = workDetailRepository.findById(req.getId());

        if (pddb.isEmpty()) {
            throw new RuntimeException("Work Detail not found");
        }

        WorkDetail exst = wddb.get();
        exst.setPosition(req.getPosition());
        exst.setDepartment(req.getDepartment());
        exst.setStartDate(req.getStartDate());
        exst.setTerminateDate(req.getTerminateDate());

        return workDetailRepository.save(exst);
    }
}
