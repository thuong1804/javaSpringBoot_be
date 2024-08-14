package com.example.be_taskmaster.modules.user.dto;

import com.example.be_taskmaster.constant.Gender;
import com.example.be_taskmaster.constant.Group;
import lombok.Data;


import java.time.Instant;
@Data
public class UserDto {
    private String name;
    private String address;
    private Gender gender;
    private Group groupId;
    private Instant createdDate;
    private String avatar;
    private Integer phone;
    private String birthDay;
}
