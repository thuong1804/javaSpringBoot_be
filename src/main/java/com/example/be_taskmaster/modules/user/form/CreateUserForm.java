package com.example.be_taskmaster.modules.user.form;

import com.example.be_taskmaster.constant.Gender;
import com.example.be_taskmaster.constant.Group;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUserForm {
    private String name;
    private String address;
    private Gender gender;
    private Group groupId;
    @Size(min = 8, message = "PASSWORD_LENGTH")
    private String password;
    private String avatar;
    private Integer phone;
    private String birthDay;
}
