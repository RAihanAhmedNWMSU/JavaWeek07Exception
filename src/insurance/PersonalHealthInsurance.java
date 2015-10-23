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
public class PersonalHealthInsurance extends HealthInsurance {
  
   private Person person;

    public PersonalHealthInsurance(Person person) {
        this.person = person;
    }
  
    /**
     *
     * @param totalMonths
     * @return
     * @throws IncorrectMonthException
     */
    @Override
   public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException{
       int numberOfYearsForPerson=totalMonths/12;
               int numberOfMonthsForPerson=totalMonths%12;
               
               return (numberOfYearsForPerson*calcYearlyInstallment()+numberOfMonthsForPerson*calcMonthlyInstallment());
   }

    /**
     *
     * @return
     */
   @Override
    public double calcMonthlyInstallment(){
       double monthlyInstallment=0;
       if(person.getAge()<=10 || person.getAge()>=60){
           monthlyInstallment=MONTHLY_INSTALLMENT-(0.2*MONTHLY_INSTALLMENT);
           return monthlyInstallment;
       }
       else{
           monthlyInstallment=MONTHLY_INSTALLMENT;
           return monthlyInstallment;
       }
       
   }
   
   @Override
   public double calcYearlyInstallment(){
       double yearlyInstallment=0;
       if(person.getAge()<=10 || person.getAge()>=60){
           yearlyInstallment=YEARLY_INSTALLMENT_ONETIME_PAYMENT-(0.2*YEARLY_INSTALLMENT_ONETIME_PAYMENT);
           return yearlyInstallment;
       }else{
           yearlyInstallment=YEARLY_INSTALLMENT_ONETIME_PAYMENT;
            return yearlyInstallment;
       }
      
   }
   
   @Override
   public double calcExemption(int totalMonths) throws IncorrectMonthException{
       return super.calcLifeInsurance(totalMonths)-this.calcLifeInsurance(totalMonths);
   }

   @Override
   public String toString(){
       return String.format("%-10s %-10s %-10s %3.2f; Monthly Installment : $%3.2f; Yearly Installment: $%3.2f",person.getFirstName(),person.getLastName(),person.getGender(),person.getAge(), this.calcMonthlyInstallment(),this.calcYearlyInstallment());
   }
}
