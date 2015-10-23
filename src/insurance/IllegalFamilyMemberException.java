/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

/**
 *
 * @author Raihan Ahmed Mohammed
 */
public class IllegalFamilyMemberException extends Exception {

    /**
     * Creates a new instance of <code>IllegalFamilyMemberException</code>
     * without detail message.
     */
    public IllegalFamilyMemberException() {
    }

    /**
     * Constructs an instance of <code>IllegalFamilyMemberException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalFamilyMemberException(String msg) {
        super(msg);
    }
}
