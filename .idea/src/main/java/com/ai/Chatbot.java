package com.ai;


import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SimpleChatbot: Hello! How can I help you today?");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("SimpleChatbot: Goodbye! Have a great day!");
                break;
            } else {
                String response = generateResponse(userInput);
                System.out.println("SimpleChatbot: " + response);
            }
        }

        scanner.close();
    }

    private static String generateResponse(String userInput) {
        // Simple rule-based responses
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hi there! How can I assist you?";
        } else if (userInput.contains("how are you")) {
            return "I'm just a program, but I'm doing well. How can I help you?";
        } else {
            return "I'm sorry, I didn't understand that. Can you please rephrase?";
        }
    }
}
