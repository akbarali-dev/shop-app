package com.example.shopapp.model;


import com.example.shopapp.model.enums.Gender;
import com.example.shopapp.model.template.AbsEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User extends AbsEntity {
    String fullName;

    @Column(unique = true)
    String email;

    @Column(unique = true)
    String phoneNumber;

    @NotNull
    String password;

    LocalDate birthday;

    @Enumerated(EnumType.STRING)
    Gender gender = Gender.OTHER;

    @OneToMany(mappedBy = "user")
    private List<Cart> carts;

    public User(String fullName, String email, String phoneNumber, String password) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
