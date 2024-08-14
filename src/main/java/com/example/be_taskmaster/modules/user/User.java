package com.example.be_taskmaster.modules.user;

import com.example.be_taskmaster.constant.Gender;
import com.example.be_taskmaster.constant.Group;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
@Entity
@Table(name= "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "groupId", nullable = false)
    private Group groupId;

    @Column(name = "password", nullable = false)
    private String password;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private Instant createdDate;

    @Column(name = "avatar", nullable = true)
    private String avatar;

    @Column(name = "phone", nullable = true)
    private Integer phone;

    @Column(name = "birthDay", nullable = true)
    private String birthDay;
}
