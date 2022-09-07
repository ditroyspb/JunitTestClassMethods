import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook sut;
    Map<String, List<Contact>> map = new HashMap<>();

    @Test
    void createGroupTest() {
        //arrange
        String a = "Family";
        //act
        sut.createGroup(a);
        //assert
        assertThat(map, hasKey(a));
    }

    @Test
    void addContactsToGroups() {
        //arrange
        String name = "Petr";
        String number = "89112223344";
        String group = "Family";
        Contact contact = new Contact(name, number);
        //act
        sut.addContactsToGroups(group, contact);
        //assert
        assertThat(map.get(group), contains(contact));
    }


    @BeforeEach
    public void initTest() {
        System.out.println("Test started");
    }

    @AfterEach
    public void finishTest() {
        System.out.println("Test finished");
    }

    @BeforeAll
    public static void startedTests() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finishedTests() {
        System.out.println("Tests finished");
    }
}