/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package handshake;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class Handshake {

    /**
     * @param args the command line arguments
     */
    public static int countOfHandshake(int numberOfPeople) {
        return numberOfPeople * (numberOfPeople - 1) / 2;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Doc input so luong test case
        System.out.print("Enter number of test case: ");
        int numberOfTestCase = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[numberOfTestCase];
        //Doc tung test case
        for (int i = 0; i < numberOfTestCase; i++) {
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Output: ");
        for (int i = 0; i < numberOfTestCase; i++) {
            System.out.println(countOfHandshake(numbers[i]));
        }
    }

}
