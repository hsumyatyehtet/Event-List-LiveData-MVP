package com.padcmyanmar.padc9kotlinbasicdemo;

import java.util.Objects;

public class Programmer {

    private static final int DEFAULT_AGE = 25;
    private static int counter;
    /*
     * Java's private fields need getters/setters to achieve Encapsulation
     */
    private int mAge;
    private Address mAddress;
    // Need to initialize final variables Now or later in Constructor body
    private final String mFirstName;
    private final String mLastName;
    private final String mLanguage;
    private final String mSkill;

    public Programmer(String firstName, String lastName, String language, String skill) {
        this(firstName, lastName, language, skill, DEFAULT_AGE, null);
    }

    public Programmer(String firstName, String lastName, String language, String skill, int age) {
        this(firstName, lastName, language, skill, age, null);
    }

    public Programmer(String firstName, String lastName, String language, String skill, Address address) {
        this(firstName, lastName, language, skill, DEFAULT_AGE, address);
    }

    public Programmer(String firstName, String lastName, String language, String skill, int age, Address address) {
        this.mAge = age;
        this.mAddress = address;
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mLanguage = language;
        this.mSkill = skill;
        counter++;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        if (mAge > 0) {
            this.mAge = mAge;
        }
    }

    public String getLanguage() {
        return mLanguage;
    }

    public String getSkill() {
        return mSkill;
    }

    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(Address mAddress) {
        this.mAddress = mAddress;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mLanguage='" + mLanguage + '\'' +
                ", mSkill='" + mSkill + '\'' +
                ", mAge=" + mAge +
                ", mAddress=" + mAddress +
                '}';
    }

    // main method needs a Class
    public static void main(String[] args) {

        final Programmer jake = new Programmer("Jake", "Wharton", "Java", "Hacker");
        ProgrammerUtils.sayHello(jake);

        Programmer variable = new Programmer("Robert", "Martin", "Java", "Guru", 64);
        ProgrammerUtils.sayHello(variable);

        variable = new Programmer("David", "Karnok", "Rxjava", "Expert");
        ProgrammerUtils.sayHello(variable);

        Programmer.printTotal();
    }

    public static void printTotal() {
        System.out.printf("Total = %d", counter);
    }
}
