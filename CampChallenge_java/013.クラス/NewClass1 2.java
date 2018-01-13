/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoshiiakiko
 */
//以下の機能を持つクラスを作成してください。
//1. パブリックな２つの変数と、２つの変数に値を設定するパブリックなメソッドと、２つの変数の中身をprintするパブリックなメソッド

public class NewClass1 {
    public static void main(String[] args) {
    String name = fullName("Kate","jones");
    
    System.out.println(name);
            
  
    }
    
    public static String fullName(String firstName, String lastName) {
    return firstName + "" + lastName;
    }
}


