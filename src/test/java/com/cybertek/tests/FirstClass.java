package com.cybertek.tests;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class FirstClass {

    public static void main(String[] args) {

        //System.out.println("Hello World");

        Faker faker = new Faker();

        //first write the methods then sout+ender. It automatically writes below
        System.out.println(faker.name().fullName());

        System.out.println(faker.harryPotter().character());

        System.out.println(faker.finance().creditCard(CreditCardType.MASTERCARD));
    }

}
