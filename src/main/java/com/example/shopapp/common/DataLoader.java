package com.example.shopapp.common;


import com.example.shopapp.model.Age;
import com.example.shopapp.model.Size;
import com.example.shopapp.model.User;
import com.example.shopapp.repository.AgeRepository;
import com.example.shopapp.repository.SizeRepository;
import com.example.shopapp.repository.UserRepository;
import com.example.shopapp.service.interfaces.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Value("${spring.sql.init.mode}")
    String initMode;

    @Autowired
    UserRepository userRepository;

    @Autowired
    SizeRepository sizeRepository;

    @Autowired
    AgeRepository ageRepository;

    @Override
    public void run(String... args) throws Exception {
        if (initMode.equals("always")) {

            List<User> users = new ArrayList<>(Arrays.asList(
                    new User("Akbarali Asqaraliyev",
                            "akbaraliiasqaraliyev@gmail.com",
                            "+998904288150", "11111"),

                    new User("Zaxriddin Xasanov",
                            "zaxriddin@gmail.com",
                            "+998904288151", "11111")
            ));
            List<User> usersSave = userRepository.saveAll(users);


            List<Age> ages = new ArrayList<>();
            for (int i = 15; i <=40; i++) {
                ages.add(new Age(i));
            }
            List<Age> savedAge = ageRepository.saveAll(ages);
        }
    }
}
