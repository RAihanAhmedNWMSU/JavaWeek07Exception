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
    static double MONTHLY_INSTALLMENT=1000;
    static double YEARLY_INSTALLMENT_ONETIME_PAYMENT=10000;
    
    public double calcMonthlyInstallment();
    public double calcYearlyInstallment();
    public double   calcExemption(int totalMonths) throws IncorrectMonthException;
    
    
}
