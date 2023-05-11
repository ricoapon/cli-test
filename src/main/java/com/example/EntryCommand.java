package com.example;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine.Command;

@TopCommand
@Command(mixinStandardHelpOptions = true, subcommands = {ByeCommand.class, GreetingCommand.class})
public class EntryCommand {
}
