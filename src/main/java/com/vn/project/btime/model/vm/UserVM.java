/* BTime - 2024 */
package com.vn.project.btime.model.vm;

import com.vn.project.btime.constant.Gender;

public record UserVM(
        Long id,
        String name,
        Gender gender,
        String address,
        String phoneNumber,
        String avatar,
        Boolean active) {}
