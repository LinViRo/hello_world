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
public class Student extends Person{
    
    public Student(String name, String lastName){
        super(name, lastName);
    }
    
    public void saludo(){
        super.printHelloWorld();
        super.printAge();
    }
    
}
