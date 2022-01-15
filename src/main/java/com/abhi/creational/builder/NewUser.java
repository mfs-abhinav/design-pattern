package com.abhi.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NewUser {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;

    private NewUser() {}

    @Override
    public String toString() {
        return "NewUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NewUserBuilder {
        private final List<Consumer<NewUser>> operations;

        public static NewUserBuilder newUser() {
            return new NewUserBuilder();
        }

        // constructor for required fields
        public static NewUserBuilder newUser(String firstName, String lastName) {
            NewUserBuilder newUserBuilder = new NewUserBuilder();
            newUserBuilder.operations.add(op -> op.firstName = firstName);
            newUserBuilder.operations.add(op -> op.lastName = lastName);
            return newUserBuilder;
        }

        private NewUserBuilder() {
            this.operations = new ArrayList<>();
        }

        public NewUserBuilder setFirstName(String name) {
            operations.add(u -> u.firstName = name);
            return this;
        }

        public NewUserBuilder setLastName(String name) {
            operations.add(u -> u.lastName = name);
            return this;
        }

        public NewUserBuilder setAge(int age) {
            operations.add(u -> u.age = age);
            return this;
        }

        public NewUserBuilder setPhoneNumber(String number) {
            operations.add(u -> u.phoneNumber = number);
            return this;
        }

        public NewUserBuilder setAddress(String address) {
            operations.add(u -> u.address = address);
            return this;
        }

        public NewUser build() {
            NewUser newUser = new NewUser();
            operations.forEach(action -> action.accept(newUser));

            // we can add validation here if required
            return newUser;
        }
    }
}
