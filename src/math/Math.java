/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package math;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xsayars
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int correctAnswers = 0;
    int Answers = 0;
    Random numGenerator = new Random();
    Scanner inputScanner = new Scanner(System.in);
    int[] nums =  new int[2];
    System.out.println("Проверь знание таблицы умножения");
    while(Answers != 5) {
        nums[0] = numGenerator.nextInt(9)+1;
        nums[1] = numGenerator.nextInt(9)+1;
        System.out.print(nums[0]+" * "+nums[1]+" = ");
        int answer = inputScanner.nextInt();
        ++Answers;
        if(answer == nums[0]*nums[1]) {
            System.out.println(ConsoleColors.GREEN + "Правильно."+ ConsoleColors.RESET);
            ++correctAnswers;
        }
        else

            System.out.println(ConsoleColors.RED +"Ошибка." + ConsoleColors.RESET);
        if (correctAnswers == 5){
            System.out.println(ConsoleColors.GREEN + "Молодец!" + ConsoleColors.RESET);
        }
    }
    System.out.println(ConsoleColors.RED + "Завершение программы." + ConsoleColors.RESET);
  }
}        
 
    
    
   
    

    

