/* BTime - 2024 */
package com.vn.project.btime.entity;

import com.vn.project.btime.constant.Gender;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
@SequenceGenerator(name = "generator", sequenceName = "user_id_seq", allocationSize = 1)
public class UserEntity extends BaseEntity {

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "active", nullable = false)
    private Boolean active;
}
