package com.example.be_taskmaster.modules.user.form;

import com.example.be_taskmaster.constant.Gender;
import com.example.be_taskmaster.constant.Group;
import lombok.Data;

@Data
public class UpdateUserForm {
    private Integer id;
    private String name;
    private String address;
    private Gender gender;
    private Group groupId;
    private String password;
    private String avatar;
    private Integer phone;
    private String birthDay;
}
