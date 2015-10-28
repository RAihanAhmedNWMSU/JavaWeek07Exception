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
public class FamilyHealthInsurance extends HealthInsurance {
    
    /**
     * familyMembers array of Person type.

     */
   private Person[] familyMembers;
   /**
    * The personsCount denotes the number of members in family at an 
 instance of time. Initially it must be assigned to zero
    */
   private int personCount=0;
   
   
/**
 * Initialize the length of the familyMembers array by using one-arg constructor
 * @param numberOfPersons Number Of Persons
 */
    public FamilyHealthInsurance(int numberOfPersons) {
        familyMembers=new Person[numberOfPersons];
    }
    
    /**
     * This method adds the person to the familyMembers array.

     * @param person The value of the new person to be added.
     * @throws IllegalFamilyMemberException If the total number of persons is greater than the length of the familyMembers array.
     */
   public void addPerson(Person person) throws IllegalFamilyMemberException{
       if(personCount>familyMembers.length){
           throw new IllegalFamilyMemberException();
       }
       familyMembers[personCount]=person;
       personCount++;
   }
   
   /**
    * This method returns a person of the family stored at index in family Member array
    * @param index Used to get the person at a particular index
    * @return The person at a specific index.
    */
   public Person getFamilyMember(int index){
       return familyMembers[index];
   }
   
   /**
    * This method returns the person count
    * @return The person count
    */
   public int getPersonCount(){
       return personCount;
   }
   
   
   /**
    * This method calculates the life insurance value  for the whole family.
 If totalMonths is 42, which is equivalent to 3 years and 6 months.
 The method should return the sum of the number of years times the return 
 value of the calcYearlyInstallment() method and the number of 
 months times the return value of the calcMontlyInstallment() method.
 
 For example: If the totalMonths is 42, the method should return 110160.00



    * @param totalMonths The number of months
    * @return Returns the value of life insurance calculation
    * @throws IncorrectMonthException If the totalMonths is less than 0.
    */
   @Override
   public double calcLifeInsurance(int totalMonths)throws IncorrectMonthException{
       if(totalMonths<0){
           throw new IncorrectMonthException();
       }
       
     int numberOfYearsInTotalMonths=totalMonths/12;  
     int numberOfMonthsInTotalMonths=totalMonths%12;
     
     return (numberOfYearsInTotalMonths*calcYearlyInstallment()+numberOfMonthsInTotalMonths*calcMonthlyInstallment());
   }
   
   
   
   /**
    * This method calculates the monthly installment value for the whole family.
 If the person's age in a family is less than or equal to 10.00 or greater
 than or equal to 60.00, then the method should calculate the difference 
 of the monthly installment and the 20% of the monthly installment;
 else no % should be given on the monthly installment.
 The above calculation gives the value of monthly installment based on 
 age of a person. Next, pass the above value to the calcFamilyDiscount()
 method to get the final monthly installment value of a person based on 
 the number of persons in a family.
 
 For example: If the number of persons in the family is one and the age of 
 the person is 10. 
 The value of monthly installment based on age will give 800.00
 Next, pass the above value to the calcFamilyDiscount() method.
 The method calculate and return the value based on number of persons
 which is equal to 800.00
 
 For example: If the number of persons in a family is equal to 4, 
 
              65 Charles Manson Male 
 
              26 Alfonso Ribeiro Male
 
              10 Admiral Nelson Male
 
              40 Abraham Hicks Female
 
      For the age equals to 65, the monthly installment value is 680.00.
      For the age equals to 26, the monthly installment value is 850.00.
      For the age equals to 10, the monthly installment value is 680.00.
      For the age equals to 40, the monthly installment value is 850.00.
 The calcMonthlyInstallment() method should return the sum of the monthly 
 installment of the each person which is equal to 3060.00
 


    * @return Returns the value of monthly installment calculation
    */
   @Override
   public double calcMonthlyInstallment(){
       double monthlyInstallment=0;
       double totalMonthlyInstallment=0;
       for(int i=0;i<personCount;i++){
           if(familyMembers[i].getAge()<=10 || familyMembers[i].getAge()>=60){
           monthlyInstallment=MONTHLY_INSTALLMENT-(0.2*MONTHLY_INSTALLMENT);
           }
           else{
               monthlyInstallment=MONTHLY_INSTALLMENT;
           }
           monthlyInstallment=calcFamilyDiscount(monthlyInstallment);
           totalMonthlyInstallment=totalMonthlyInstallment+monthlyInstallment;
       }
       return totalMonthlyInstallment;
   }
   
   
   /**
    * This method calculates the yearly installment value for the whole family.
 If the person's age in a family is less than or equal to 10.00 or greater
 than or equal to 60.00, then the method should calculate the difference 
 of the yearly installment and the 20% of the yearly installment;
 else no % should be given on the yearly installment.
 The above calculation gives the value of yearly installment based on 
 age of a person. Next, pass the above value to the calcFamilyDiscount()
 method to get the final yearly installment value of a person based on 
 the number of persons in a family.
 
 For example: If the number of persons in the family is one and the age of 
 the person is 10. 
 The value of yearly installment based on age will give 8000.00
 Next, pass the above value to the calcFamilyDiscount() method.
 The method calculate and return the value based on number of persons
 which is equal to 8000.00
 
 For example: If the number of persons in a family is equal to 4, 
 
              65 Charles Manson Male 
 
              26 Alfonso Ribeiro Male
 
              10 Admiral Nelson Male
 
              40 Abraham Hicks Female
 
      For the age equals to 65, the yealy installment value is  6800.00.
      For the age equals to 26, the yealy installment value is  8500.00.
      For the age equals to 10, the yealy installment value is  6800.00.
      For the age equals to 40, the yealy installment value is  8500.00.
 The calcYearlyInstallment() method should return the sum of the yearly 
 installment of the each person which is equal to 30600.00


    * @return Returns the value of yearly installment calculation.
    */
   @Override
   public double calcYearlyInstallment(){
      double yearlyInstallment=0;
      double totalYearlyInstallment=0;
       for(int i=0;i<personCount;i++){
           if(familyMembers[i].getAge()<=10 || familyMembers[i].getAge()>=60){
           yearlyInstallment=YEARLY_INSTALLMENT_ONETIME_PAYMENT-(0.2*YEARLY_INSTALLMENT_ONETIME_PAYMENT);
           }
           else{
               yearlyInstallment=YEARLY_INSTALLMENT_ONETIME_PAYMENT;
           }
           yearlyInstallment=calcFamilyDiscount(yearlyInstallment);
           totalYearlyInstallment=totalYearlyInstallment+yearlyInstallment;
       }
       return totalYearlyInstallment; 
   }
   
   /**
    * This method calculates the exemption amount value of the whole family.
 The method should return the difference of the calcLifeInsurance()  
 method value in it's super class times the number of persons and 
 the value of calcLifeInsurance() method.
 
 For example: If the totalMonths is 40, the method should return 31960.00



    * @param totalMonths The number of months.
    * @return Returns the value of Exemption calculation.
    * @throws IncorrectMonthException If the totalMonths is less than 0.
    */
   @Override
   public double calcExemption(int totalMonths) throws IncorrectMonthException{
       if(totalMonths<0){
           throw new IncorrectMonthException();
       }
       return (super.calcLifeInsurance(totalMonths)*personCount)-this.calcLifeInsurance(totalMonths);
   }
  
   
   /**
    * This method calculates the family discount value for the whole family. 
 If the total family members count is equal to 4, then the method 
 should calculate the difference of the valueBasedOnAge and 15% 
 of the valueBasedOnAge; else if the total family members count
 is greater than or equal to 5, then the method should return the 
 difference of the valueBasedOnAge and 20% of the valueBasedOnAge.
 If the total family members count is not in the above specific 
 range then the method should return the valueBasedOnAge; 
 
 For example: If the total family members count is equal to 4 and valueBasedOnAge is 800.00,
 then the method should return 680.00


    * @param valueBasedOnAge The value based on the age.
    * @return the value of family discount calculation.
    */
   public double calcFamilyDiscount(double valueBasedOnAge){
       if(personCount==4){
           valueBasedOnAge=valueBasedOnAge-(0.15*valueBasedOnAge);
       }
       else if(personCount>=5){
           valueBasedOnAge=valueBasedOnAge-(0.2*valueBasedOnAge);
       }
       return valueBasedOnAge;
       
   }
   
   
   /**
    * The string representation consists of the familyMembers array, 
 calcMontlyInstallment() and the calcYearlyInstallment().
 Please refer to the word document for the sample output.

    * @return A string representation of the object.
    */
   @Override
   public String toString(){
       
   String toReturn="";
       for(int i=0;i<personCount;i++){
       toReturn+=String.format("%-10s %-10s %-10s %3.2f; Family Monthly Installment: $%3.2f; Family yearly Installment: $%3.2f\n",familyMembers[i].getFirstName(),familyMembers[i].getLastName(),familyMembers[i].getGender(),familyMembers[i].getAge(),this.calcMonthlyInstallment(),this.calcYearlyInstallment());
   }
       return toReturn;
}
}
