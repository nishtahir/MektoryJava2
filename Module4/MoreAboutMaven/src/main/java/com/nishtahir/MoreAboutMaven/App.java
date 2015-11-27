package com.nishtahir.MoreAboutMaven;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String someString = "Hello World";

        //This code will fail to compile since the
        //maven compiler plugin has been set to Java 1.6
        //switching Strings was included in Java 1.7
        switch(someString){
          case "Hello World":
            System.out.println( "This code will only compile with Java 1.7 or higher" );
          break;

          default:
        }
    }
}
