/* BTime - 2024 */
package com.vn.project.btime.repository;

import com.vn.project.btime.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {}
