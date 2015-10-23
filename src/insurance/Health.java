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
    public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException;
}
