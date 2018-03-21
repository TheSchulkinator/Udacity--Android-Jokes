package com.theschulk.javajokes;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JavaJokeLibrary {

    List<String> randomJokes =  asList(
            "Knock, knock. \n" +
                    "Who's there? \n" +
                    "Alfie \n" +
                    "Alfie who? \n" +
                    "Alfie terrible if you leave!",
            "Knock, knock. \n" +
                    "Who's there? \n" +
                    "Amish! \n" +
                    "Amish who? \n" +
                    "You're not a shoe!",
            "Knock, knock. \n" +
                    "Who's there? \n" +
                    "Alien \n" +
                    "Alien who? \n" +
                    "Just how many aliens do you know?",
            "Knock, knock. \n" +
                    "Who’s there? \n" +
                    "Abby. \n" +
                    "Abby who? \n" +
                    "Abby birthday to you!",
            "Knock, knock. \n" +
                    "Who's there? \n" +
                    "Andrew! \n" +
                    "Andrew who? \n" +
                    "Andrew a picture!",
            "Knock, knock. \n" +
                    "Who's there? \n" +
                    "Annie \n" +
                    "Annie who? \n" +
                    "Annie one you like!",
            "Knock, knock. \n" +
                    "Who's there? \n" +
                    "Argo \n" +
                    "Argo who? \n" +
                    "Argo down the shops if you aren't going to let me in!");

    public  String randomJoke() {
        int randomInt= new Random().nextInt(6);
        return randomJokes.get(randomInt);
    }
}
