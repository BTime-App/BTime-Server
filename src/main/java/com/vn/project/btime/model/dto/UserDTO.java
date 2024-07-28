/* BTime - 2024 */
package com.vn.project.btime.model.dto;

import com.vn.project.btime.constant.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
        @NotNull String name,
        @NotNull @Email String email,
        @NotNull String password,
        String phoneNumber,
        Gender gender,
        String address,
        String avatar) {}
