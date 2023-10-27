package com.techelevator.menu;

import java.util.Scanner;

public class MenuDisplay {

    private static Scanner input = new Scanner(System.in);

    public static String prompt(String[] options) {
        int selectedOption = -1;
        while(true) {
            try {
                printOptions(options);
                selectedOption = Integer.parseInt(input.nextLine());
                selectedOption--;
                if(selectedOption >= 0 && selectedOption < options.length)
                    break;
            } catch(Exception ex){
                //nothing for now
            }

            System.out.println("Invalid option >:0 ");
        }

        return options[selectedOption];
    }

    private static void printOptions(String[] options) {

        System.out.println("Please select an option:");
        for(int i = 0;  i < options.length; i++){

            int optionNum = i + 1;
            System.out.println( "(" + optionNum + ") " + options[i] );

        }

    }

}
