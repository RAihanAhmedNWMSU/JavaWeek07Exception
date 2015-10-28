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
public interface Insurance {
    /**
     * MONTHLY_INSTALLMENT assigned to 1000
     */
    static final double MONTHLY_INSTALLMENT=1000;
    /**
     * YEARLY_INSTALLMENT_ONETIME_PAYMENT assigned to 10000.

     */
    static final double YEARLY_INSTALLMENT_ONETIME_PAYMENT=10000;
    
    /**
     * Calculates monthly installment.

     * @return Returns the value of monthly installment calculation.
     */
    public double calcMonthlyInstallment();
    
    /**
     * Calculates yearly installment.

     * @return Returns the value of yearly installment calculation.
     */
    public double calcYearlyInstallment();
    
    
    /**
     * The exemption amount a person gets for a given number of months.

     * @param totalMonths The number of months.
     * @return Returns the value of discount amount calculation.
     * @throws IncorrectMonthException If the totalMonths is less than 0.
     */
    public double calcExemption(int totalMonths) throws IncorrectMonthException;
    
    
}
