package com.example.test1.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Getter
@Setter
public class RequestDetailModel {

    @ApiModelProperty(required=true, position=1)
    @NotBlank(message = "employeeId is mandatory")
    private String employeeId;

    @ApiModelProperty(required=true, position=2)
    @NotBlank(message = "name is mandatory")
    private String name;

    @ApiModelProperty(required=true, position=3)
    @NotBlank(message = "idCard is mandatory")
    private String idCard;

    @ApiModelProperty(required=true, position=4)
    @NotBlank(message = "birthDate is mandatory")
    private String birthDate;

    @ApiModelProperty(required=true, position=5)
    @NotBlank(message = "mobileNo is mandatory")
    private String mobileNo;

    @ApiModelProperty(required=true, position=6)
    @NotBlank(message = "position is mandatory")
    private String position;

    @ApiModelProperty(required=true, position=7)
    @NotBlank(message = "department is mandatory")
    private String department;

    @ApiModelProperty(required=true, position=8)
    @NotBlank(message = "startDate is mandatory")
    private String startDate;

    private String terminateDate;

}
