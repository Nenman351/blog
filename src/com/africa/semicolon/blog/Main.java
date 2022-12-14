package com.africa.semicolon.blog;

import com.africa.semicolon.blog.controllers.PostController;
import com.africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.swing.*;

@SpringBootApplication
@EnableMongoRepositories
public class Main {

//    private static Scanner keyboardInput = new Scanner(System.in);
//    private static PostController postController = new PostController();


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        displayMainMenu();
    }

//    private static void displayMainMenu(){
//        String mainMenu = """
//                Press 1 for create post
//                Press 2 for view post
//                Press 3 to exit
//                """;
//        String userInput = input(mainMenu);
//        switch (Integer.parseInt(String.valueOf(userInput.charAt(0)))) {
//            case 1 -> createPost();
//            case 2 -> viewPost();
//            case 3 -> exitFromApp();
//        }
//    }
//
//    private static void exitFromApp() {
//        print("Thank you for using our app");
//        System.exit(0);
//
//    }
//
//    private static String input(String prompt){
//        return JOptionPane.showInputDialog(prompt);
//    }
//
//    private static void print(String prompt){
//        JOptionPane.showMessageDialog(null,prompt);
//    }
//
//    public static void createPost(){
//        String title = input("Enter post title");
//        String body = input("Enter your post");
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setTitle(title);
//        createPostRequest.setBody(body);
//        print(postController.createPost(createPostRequest));
//        displayMainMenu();
//
//
//    }
//
//    public  static void  viewPost(){
//        String userInput = input("Enter post id");
//        print(postController
//                .viewPost(userInput);
//        displayMainMenu();
//    }
}
