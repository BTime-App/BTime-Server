/* BTime - 2024 */
package com.vn.project.btime.mapper;

import com.vn.project.btime.entity.UserEntity;
import com.vn.project.btime.model.dto.UserDTO;
import com.vn.project.btime.model.vm.UserVM;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "active", expression = "java(Boolean.TRUE)")
    UserEntity toEntity(UserDTO userDTO);

    UserVM toVM(UserEntity userEntity);
}
