package com.udacity.gradle.builditbigger.backend;

import com.theschulk.javajokes.JavaJokeLibrary;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    //private String myData;

    public String getData() {
        String myData = new JavaJokeLibrary().randomJoke();
        return myData;
    }

}