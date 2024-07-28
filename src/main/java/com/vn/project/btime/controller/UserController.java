/* BTime - 2024 */
package com.vn.project.btime.controller;

import com.vn.project.btime.mapper.UserMapper;
import com.vn.project.btime.model.dto.UserDTO;
import com.vn.project.btime.model.vm.UserVM;
import com.vn.project.btime.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public record UserController(UserService userService, UserMapper userMapper) {

    @PostMapping
    public UserVM createUser(@RequestBody @Valid UserDTO userDTO) {
        return userMapper.toVM(userService.saveAndFlush(userMapper.toEntity(userDTO)));
    }
}
