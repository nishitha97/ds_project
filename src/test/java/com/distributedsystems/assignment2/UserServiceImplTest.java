package com.distributedsystems.assignment2;


import com.distributedsystems.assignment2.configuration.AuthenticationConfig;
import com.distributedsystems.assignment2.domain.User;
import com.distributedsystems.assignment2.repository.UserRepository;
import com.distributedsystems.assignment2.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {


    @InjectMocks
    UserServiceImpl userService;

    @Mock
    AuthenticationConfig authenticationConfig;

    @Mock
    UserRepository userRepository;

    @Test
    public void testCreateUsers(){
        User user=new User();
        user.setContactNo("01234567890");
        user.setEmail("user@gmail.com");
        user.setUsername("user");
        user.setNic("977777777V");
        user.setPassword("1234");
        user.setCreditCardNo("1234567890123456");

        when(authenticationConfig.encrypt("1234")).thenReturn("1235");
        when(userRepository.save(user)).thenReturn(user);
        userService.createUser(user);

    }

}
