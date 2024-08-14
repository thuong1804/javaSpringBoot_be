package com.example.be_taskmaster.modules.user;

import com.example.be_taskmaster.modules.apiResponse.ApiResponse;
import com.example.be_taskmaster.modules.user.dto.UserDto;
import com.example.be_taskmaster.modules.user.form.CreateUserForm;
import com.example.be_taskmaster.modules.user.form.UpdateUserForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ApiResponse<User> CreateUser(@RequestBody @Valid CreateUserForm createUserForm) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setStatusCode(200);
        apiResponse.setMessage("Success");
        apiResponse.setResult(userService.CreateUser(createUserForm));
        return apiResponse;
    }

    @PutMapping("/update")
    public ApiResponse<User> updateUser(@RequestBody UpdateUserForm updateUserForm) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setStatusCode(200);
        apiResponse.setMessage("Success");
        apiResponse.setResult(userService.UpdateUser(updateUserForm));
        return apiResponse;
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse<String> deleteUser(@PathVariable int id) {
        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setStatusCode(200);
        apiResponse.setMessage("Success");
        apiResponse.setResult("true");
        userService.deleteUser(id);
        return apiResponse;
    }

    @GetMapping("/{id}")
    public ApiResponse<User> getDetail(@PathVariable int id) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setStatusCode(200);
        apiResponse.setMessage("Get detail user success");
        apiResponse.setResult(userService.getUserById(id));
        return apiResponse;
    }

    @GetMapping("/")
    public ApiResponse<List<User>> getAllUser() {
        ApiResponse<List<User>> apiResponse = new ApiResponse<>();
        apiResponse.setStatusCode(200);
        apiResponse.setMessage("Get all user success");
        apiResponse.setResult(userService.getUser());
        return apiResponse;
    }
}
