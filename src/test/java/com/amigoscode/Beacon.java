package com.amigoscode;

import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
import com.amigoscode.mockdata.MockData;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Beacon {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Beacon.class);
    public static void main(String[] args) throws IOException {
        testing();
    }

    public static void  testing() throws IOException {
        HashSet<Person> persons= MockData.getPeopleHash();

        long no=  persons.stream().filter(p -> p.getAge()<=18).count();
        long numbers=persons.stream().filter(ages-> ages.getAge()<=18).limit(10).count();
        Set<Person> ps= persons.stream().filter(ages-> ages.getAge()<=18).limit(10).collect(Collectors.toSet());
            ps.forEach(System.out::println);

        System.out.println("total= "+ numbers);
        System.out.println("Total from No :"+ no);
        log.info("testing....");

    }
}
