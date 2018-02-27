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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person lin = new Person("Linette", "Vidal");
        System.out.println(lin.lastName);
        System.out.println(lin.name);
        System.out.println(lin);
        lin.printHelloWorld();
        Student eliot = new Student("Eliot", "Fuentes");
        System.out.println(eliot.name);
        eliot.printHelloWorld();
        eliot.saludo();
        eliot.name = "Sergio";
        System.out.println(eliot.name);
    }
    
}
