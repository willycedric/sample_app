package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        if(args.length > 0 && args!=null)
          System.out.println(new App().getMessage(args[0]));
        else
          
          System.out.println(new App().getMessage(""));
    }

    private final String getMessage(String entry) {
        if(entry != ""){
           return entry;
       }else{
      
         return message;
       }
    }

}
