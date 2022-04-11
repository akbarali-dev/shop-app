package com.example.shopapp.projection;

import java.util.UUID;

public interface UserProjection {
    UUID getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getBirthday();

    String getGender();
}
