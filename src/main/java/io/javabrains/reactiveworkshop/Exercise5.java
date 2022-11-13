package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        ReactiveSources.intNumbersFlux().subscribe(
                (number) -> System.out.println(number),
                (error) -> System.out.println(error.getMessage()),
                () -> System.out.println("Complete")
        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.userMono().subscribe(
                (user) -> System.out.println(user),
                (error) -> System.out.println(error.getMessage()),
                () -> System.out.println("Complete")
        );

        System.out.println("Press a key to end");
        System.in.read();
    }

}