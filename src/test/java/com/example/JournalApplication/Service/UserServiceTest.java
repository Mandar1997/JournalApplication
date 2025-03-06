package com.example.JournalApplication.Service;

import com.example.JournalApplication.Entity.User;
import com.example.JournalApplication.Repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        assertEquals(4, 2+2);
    }

    @Disabled
    @Test
    public void testFindByUserName(){
        User user = userRepository.findByUserName("Mandar");
        assertNotNull(user);
        assertTrue(user.getJournalEntries().isEmpty());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mandar"})
    public void testFindByUserName(String name){
        assertNotNull(userRepository.findByUserName(name));
    }

    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveUser(User name){
        assertFalse(userService.saveNewEntry(name));
    }

    @ParameterizedTest
    @CsvSource({"1,1,2", "2,2,4", "3,3,6"})
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b);
    }
}
