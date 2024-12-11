package com.tnl.backend;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tnl.backend.entities.User;
import com.tnl.backend.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Seeder implements CommandLineRunner {
    private final UserRepository userRepository;
    
    @Override
    public void run(String... args) throws Exception {
       User user1 = new User();
       user1.setGearScore(4399);
       user1.setIngame_userName("Bob");
       user1.setActivityStanding("Green");

       userRepository.saveAllAndFlush(Arrays.asList(user1));
    }
    
}
