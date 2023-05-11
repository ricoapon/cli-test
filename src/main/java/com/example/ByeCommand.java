package com.example;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "bye", mixinStandardHelpOptions = true)
public class ByeCommand implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "picocli",
            description = "Your name.")
    String name;

    @Override
    public void run() {
        System.out.printf("Bye %s!\n", name);
    }
}
