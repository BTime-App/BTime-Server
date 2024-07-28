/* BTime - 2024 */
package com.vn.project.btime.service.impl;

import com.vn.project.btime.entity.UserEntity;
import com.vn.project.btime.repository.UserRepository;
import com.vn.project.btime.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends BaseServiceImpl<UserEntity, Long> implements UserService {

    private final UserRepository userRepository;

    @Override
    UserRepository getRepository() {
        return userRepository;
    }
}
