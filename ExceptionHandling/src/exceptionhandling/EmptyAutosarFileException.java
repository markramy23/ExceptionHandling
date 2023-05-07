/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author Mark
 */
public class EmptyAutosarFileException extends RuntimeException{

    public EmptyAutosarFileException() {
    }

    public EmptyAutosarFileException(String message) {
        super(message);
    }
    
}
