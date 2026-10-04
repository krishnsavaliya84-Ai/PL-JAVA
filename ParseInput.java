/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parseinput;
import java.util.Scanner;
/**
 *
 * @author KRISHN
 */
public class ParseInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 String input = sc.nextLine();
 int num = Integer.parseInt(input.trim());
 System.out.println("You entered: " + num);
 System.out.println("Number + 10 = " + (num + 10));
 sc.close();
 }
}

