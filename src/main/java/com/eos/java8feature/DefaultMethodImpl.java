package com.eos.java8feature;
/*
* Create two interfaces piano & Guitar with single default method void play() with different implementations.
* Add single implementation class Instrument for both the interfaces.
* solve method name ambiguity in Instrument class by using two different approaches
* */

interface Piano {
    default void play() {
        System.out.println("Playing the piano");
    }
}

// Define the Guitar interface
interface Guitar {
    default void play() {
        System.out.println("Playing the guitar");
    }
}
public class DefaultMethodImpl implements Piano, Guitar{

    // Approach 1: Explicitly provide an implementation for the ambiguous method
    @Override
    public void play() {
        Piano.super.play(); // Choose which interface's default method to call
        Guitar.super.play(); // Choose which interface's default method to call
        System.out.println("Playing the instrument"); // Your additional implementation
    }

    /*
    // Approach 2: Choose one interface's default method explicitly
    @Override
    public void play() {
        Piano.super.play(); // or Guitar.super.play();
        System.out.println("Playing the instrument"); // Your additional implementation
    }

     */

    public static void main(String[] args) {
        DefaultMethodImpl instrument = new DefaultMethodImpl();
        instrument.play();
    }
}
