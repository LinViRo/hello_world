/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author eliot
 */
public class Person {
    
    String name;
    protected String lastName;
    private int age;
    
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.age = 21;
    }
    public void printHelloWorld(){
        System.out.println("Hello world");
        this.printHola();
    }
    
    private void printHola(){
        System.out.println("Hola");
    }
    protected void printAge(){
        System.out.println("" + this.age);
    }
}