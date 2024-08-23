package com.example.test1.controller;

import com.example.test1.entity.PersonalDetail;
import com.example.test1.entity.WorkDetail;
import com.example.test1.model.RequestDetailModel;
import com.example.test1.model.RequestSearch;
import com.example.test1.service.PersonalDetailService;
import com.example.test1.service.WorkDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("main")
public class Controller {

    @Autowired
    private PersonalDetailService personalDetailService;

    @Autowired
    private WorkDetailService workDetailService;

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody RequestDetailModel req) {

        PersonalDetail pd = new PersonalDetail();
        pd.setEmployeeId(req.getEmployeeId());
        pd.setName(req.getName());
        pd.setIdCard(req.getIdCard());
        pd.setBirthDate(req.getBirthDate());
        pd.setMobileNo(req.getMobileNo());

        WorkDetail wd = new WorkDetail();
        wd.setEmployeeId(req.getEmployeeId());
        wd.setPosition(req.getPosition());
        wd.setDepartment(req.setDepartment());
        wd.setStartDate(req.getStartDate());
        wd.setTerminateDate(req.getTerminateDate());

        personalDetailService.savePersonalDetail(pd);
        workDetailService.saveWorkDetail(wd);

        return ResponseEntity.ok();
    }

    @PostMapping("/read")
    public PersonalDetail read(@RequestBody RequestDetailModel req) {

        PersonalDetail pd = new PersonalDetail();
        pd.setEmployeeId(req.getEmployeeId());

        return personalDetailService.findById(pd);
    }

    @PostMapping("/searchUpdatePersonal")
    public PersonalDetail searchUpdatePersonal(@RequestBody RequestDetailModel req) {

        PersonalDetail pd = new PersonalDetail();
        pd.setEmployeeId(req.getEmployeeId());

        return personalDetailService.findById(pd);
    }

    @PostMapping("/updatePersonal")
    public PersonalDetail updatePersonalDetail(@RequestBody RequestDetailModel req) {

        PersonalDetail pd = new PersonalDetail();
        pd.setEmployeeId(req.getEmployeeId());
        pd.setName(req.getName());
        pd.setIdCard(req.getIdCard());
        pd.setBirthDate(req.getBirthDate());
        pd.setMobileNo(req.getMobileNo());

        return personalDetailService.updatePersonalDetail(pd);
    }

    @PostMapping("/searchUpdateWork")
    public PersonalDetail searchUpdatePersonal(@RequestBody RequestDetailModel req) {
        PersonalDetail pd = new PersonalDetail();
        pd.setEmployeeId(req.getEmployeeId());

        return personalDetailService.findById(pd);
    }

    @PostMapping("/updateWork")
    public PersonalDetail updateWork(@RequestBody RequestDetailModel req) {
        WorkDetail wd = new WorkDetail();
        wd.setEmployeeId(req.getEmployeeId());
        wd.setPosition(req.getPosition());
        wd.setDepartment(req.setDepartment());
        wd.setStartDate(req.getStartDate());
        wd.setTerminateDate(req.getTerminateDate());

        return personalDetailService.updatePWorkDetail(wd);
    }

}
