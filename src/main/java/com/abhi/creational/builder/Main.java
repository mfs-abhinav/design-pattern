package com.abhi.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Abhinav", "Kumar")
                        .build();

        User user2 = new User.UserBuilder("Banti", "Singh")
                .setAge(31)
                .setPhoneNumber("789739")
                .setAddress("New Delhi, India")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
