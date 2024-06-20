package com.worldofzuul.pojo;

import java.util.Scanner;

public class Parser
{
    private CommandWords commands;  // 保存所有有效的命令词
    private Scanner reader;         // 命令输入源

    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand()
    {
        String inputLine;   // 将保存完整的输入行
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // 打印提示

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
            }
        }

        Command command = commands.get(word1);
        if(command != null) {
            command.setSecondWord(word2);
        }
        return command;
    }

    public void showCommands()
    {
        commands.showAll();
    }
}

