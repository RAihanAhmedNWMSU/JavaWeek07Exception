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
public abstract class HealthInsurance implements Health {

    
    /**
     * This method calculates the life insurance value.
 If totalMonths is 42, which is equivalent to 3 years and 6 months.
 The method should return the sum of the number of years times the
 yearly installment of one time payment and the number of months times the monthly installment.
 
 For example: If the totalMonths is 42, the method should return 36000.00.


 
     * @param totalMonths The number of months.
     * @return Returns the value of life insurance calculation.
     * @throws IncorrectMonthException If the totalMonths is less than 0.
     */
    @Override
    public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException {
        if(totalMonths<0){
            throw new IncorrectMonthException();
        }
        int numberOfYears=totalMonths/12;
        int numberOfMonths=totalMonths%12;
        return (numberOfYears*YEARLY_INSTALLMENT_ONETIME_PAYMENT+numberOfMonths*MONTHLY_INSTALLMENT);
    }

   
    
}
