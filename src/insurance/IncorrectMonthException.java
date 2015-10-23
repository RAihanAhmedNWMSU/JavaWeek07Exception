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
public class IncorrectMonthException extends Exception {

    /**
     * Creates a new instance of <code>IncorrectMonthException</code> without
     * detail message.
     */
    public IncorrectMonthException() {
    }

    /**
     * Constructs an instance of <code>IncorrectMonthException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectMonthException(String msg) {
        super(msg);
    }
}
