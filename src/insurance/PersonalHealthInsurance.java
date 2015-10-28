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
  
    /**
     * Represents a person
     */
   private Person person;

   /**
    * Initialize the person by using one-arg constructor
    * @param person Person type variable.
    */
    public PersonalHealthInsurance(Person person) {
        this.person = person;
    }
  
    /**
     * This method calculates the life insurance value of the individual person.
     * If totalMonths is 42, which is equivalent to 3 years and 6 months.
     * The method should return the sum of the number of years times the return
     * value of the calcYearlyInstallment() method and the number of 
     * months times the return value of the calcMontlyInstallment() method.
     * 
     * For example: If the totalMonths is 42, the method should return 28800.00
     * 
       * @param totalMonths The number of months.
     * @return Returns the value of life insurance calculation.
     * @throws IncorrectMonthException If the totalMonths is less than 0.
     */
    @Override
   public double calcLifeInsurance(int totalMonths) throws IncorrectMonthException{
       int numberOfYearsForPerson=totalMonths/12;
               int numberOfMonthsForPerson=totalMonths%12;
               
               return (numberOfYearsForPerson*calcYearlyInstallment()+numberOfMonthsForPerson*calcMonthlyInstallment());
   }

    /**
     * This method calculates the monthly installment value of the individual person.
 If the persons age is less than or equal to 10.00 or greater than or equal to 60.00, then
 the method should return the difference of the monthly installment and the 20% of the monthly installment;
 else the method should return the monthly installment value.
 * 
For example: If the age of the person is less than or equal to 
 10.00, the method should return 800.00

     * @return Returns the value of monthly installment calculation.
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
   
    
    /**
     * This method calculates the yearly installment value of the individual person.
 If the persons age is less than or equal to 10.00 or greater than or equal to 60.00, then
 the method should return the difference of the yearly installment of one time 
 payment and the 20% of the yearly installment of one time payment;
 else the method should return the yearly installment of one time payment value.
 
 For example: If the age of the person is less than or equal to 
 10.00, the method should return 8000.00


     * @return Returns the value of yearly installment calculation.
     */
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
   
   /**
    * This method calculates the exemption amount value of the individual person.
 The method should return the difference of the calcLifeInsurance()  
 method value in it's super class and the value of calcLifeInsurance() method.
 
 For example: If the totalMonths is 40, the method should return 31960.00
 

    * @param totalMonths The number of months
    * @return Returns the value of Exemption calculation.
    * @throws IncorrectMonthException If the totalMonths is less than 0.
    */
   @Override
   public double calcExemption(int totalMonths) throws IncorrectMonthException{
       return super.calcLifeInsurance(totalMonths)-this.calcLifeInsurance(totalMonths);
   }

   
   /**
    * The string representation consists of the person, calcMontlyInstallment()
 and the calcYearlyInstallment().
 Please refer to the word document for the sample output.

    * @return A string representation of the object.
    */
   @Override
   public String toString(){
       return String.format("%-10s %-10s %-10s %3.2f; Monthly Installment : $%3.2f; Yearly Installment: $%3.2f",person.getFirstName(),person.getLastName(),person.getGender(),person.getAge(), this.calcMonthlyInstallment(),this.calcYearlyInstallment());
   }
}
