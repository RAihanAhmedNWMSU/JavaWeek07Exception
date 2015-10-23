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
