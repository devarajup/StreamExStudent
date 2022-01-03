package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PhoneNum phoneNum1 = new PhoneNum("9553038829");
        PhoneNum phoneNum2 = new PhoneNum("9553038829");

        List<PhoneNum> phoneNumList1 = Arrays.asList(phoneNum1, phoneNum2);
        PhoneNum phoneNum3 = new PhoneNum("9059876855");
        PhoneNum phoneNum4 = new PhoneNum("9553038829");

        List<PhoneNum> phoneNumList2 = Arrays.asList(phoneNum3, phoneNum4);
        Student student1 = new Student(1, "deva", 5, "505303", phoneNumList1);
        Student student2 = new Student(2, "raju", 6, "507303", phoneNumList2);
        List<Student> studentList = Arrays.asList(student1,student2);

  /*     List<Student> list = studentList.stream().filter(student -> student.getPhoneNums().stream().allMatch(phoneNum -> phoneNum.getPhoneNum().equals("9553038829"))).collect(Collectors.toList());
    list.stream().forEach(
            student -> System.out.println(student.getName())
    );*/
    /*List<Student> list = studentList.stream().filter(student -> student.getPhoneNums().stream().allMatch(phoneNum -> phoneNum.getPhoneNum().equals("9553038829"))).collect(Collectors.toList());
    list.stream().forEach(
            student -> System.out.println(student.getName())
   );*/
/*
       Optional<Student> s  = studentList.parallelStream().findFirst();
        Object o = s.isPresent() ? s.map(student -> student.getName()) : "not";
        System.out.println( o.toString());
*/



    }
}
