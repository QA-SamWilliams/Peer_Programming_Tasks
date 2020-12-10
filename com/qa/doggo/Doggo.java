package com.qa.doggo;
import java.util.ArrayList;

public class Doggo {
      public static mains(String[] args) {
          IntStream.rangeClosed(1, Integer.parseInt(args[0])).filter(i -> i != Integer.parseInt(args[1])).forEach(number -> {
              switch(number %10) {
                  case 1: System.out.println(number +(number ! = 11 ? "st" : "th")); break;
                  case 2: System.out.println(number +(number ! = 12 ? "nd" : "th")); break;
                  case 3: System.out.println(number +(number ! = 13 ? "rd" : "th")); break;
                  default: System.out.println(number + "th");
              }
          })   
      }
  }

    
}
