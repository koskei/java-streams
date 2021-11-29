package com.amigoscode;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Beacon {

    public static void main(String[] args) throws IOException {
        testing();
    }

    public static void  testing() throws IOException {
        HashSet<Person> persons= MockData.getPeopleHash();

        long no=  persons.stream().filter(p -> p.getAge()<=18).count();
        int numbers=0;
        for (Person  entries: persons.stream().filter(ages-> ages.getAge()<=18).collect(Collectors.toList())){
            numbers+=1;
            System.out.println(entries.getFirstName());
        }
        System.out.println("total= "+ numbers);
        System.out.println("Total from No :"+ no);

    }
}
