package com.padcmyanmar.padc9kotlinbasicdemo;

public final class ProgrammerUtils {

    private ProgrammerUtils() {
        // don't initialize me
    }

    static String getFullName(Programmer programmer) {
        return programmer.getFirstName() + " " + programmer.getLastName();
    }

    public static void sayHello(Programmer programmer) {
        System.out.printf("Hello... I'm %s %s. ", programmer.getFirstName(), programmer.getLastName());
        System.out.printf("A %s %s.", programmer.getLanguage(), programmer.getSkill());
        System.out.println();
        print(programmer);
        System.out.println();
    }

    static void print(Programmer programmer) {
        System.out.println(programmer);
    }

    static void printName(Programmer programmer) {
        System.out.printf("Mr.%s", getFullName(programmer));
    }

}

