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
public interface Health extends Insurance {
    /**
     * Calculates the life insurance value.

     * @param totalMonths The number of months.
     * @return Returns the value of life insurance calculation
     * @throws IncorrectMonthException If the totalMonths is less than 0.
     */
    public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException;
}
