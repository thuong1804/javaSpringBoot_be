package com.example.be_taskmaster.modules.user;

import com.example.be_taskmaster.exception.AppException;
import com.example.be_taskmaster.exception.ErrorCode;
import com.example.be_taskmaster.modules.user.dto.UserDto;
import com.example.be_taskmaster.modules.user.form.CreateUserForm;
import com.example.be_taskmaster.modules.user.form.UpdateUserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User CreateUser (CreateUserForm createUserForm) {
        User user = new User();

        if(userRepository.existsByName(createUserForm.getName())) {
            throw new AppException(ErrorCode.USER_EXISTED);
        }

        if(userRepository.existsByPhone(createUserForm.getPhone())) {
            throw new AppException(ErrorCode.PHONE_EXISTED);
        }

        user.setName(createUserForm.getName());
        user.setBirthDay(createUserForm.getBirthDay());
        user.setGroupId(createUserForm.getGroupId());
        user.setGender(createUserForm.getGender());
        user.setAddress(createUserForm.getAddress());
        user.setAvatar(createUserForm.getAvatar());
        user.setPassword(createUserForm.getPassword());
        user.setPhone(createUserForm.getPhone());
        return userRepository.save(user);
    }

   public List<User> getUser() {
        return userRepository.findAll();
   }

   public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
   }

    public User UpdateUser (UpdateUserForm updateUserForm) {
        User user = userRepository.findById(updateUserForm.getId()).orElse(null);
        user.setName(updateUserForm.getName());
        user.setBirthDay(updateUserForm.getBirthDay());
        user.setGroupId(updateUserForm.getGroupId());
        user.setGender(updateUserForm.getGender());
        user.setAddress(updateUserForm.getAddress());
        user.setAvatar(updateUserForm.getAvatar());
        user.setPassword(updateUserForm.getPassword());
        user.setPhone(updateUserForm.getPhone());
        return userRepository.save(user);
    }

   public void deleteUser (int id) {
        userRepository.deleteById(id);
   }
}
