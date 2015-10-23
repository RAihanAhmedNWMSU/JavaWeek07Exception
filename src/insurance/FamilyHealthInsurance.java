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
   private Person[] familyMembers;
   private int personCount=0;

    public FamilyHealthInsurance(int numberOfPersons) {
        familyMembers=new Person[numberOfPersons];
    }
   public void addPerson(Person person) throws IllegalFamilyMemberException{
       if(personCount>familyMembers.length){
           throw new IllegalFamilyMemberException();
       }
       familyMembers[personCount]=person;
       personCount++;
   }
   public Person getFamilyMember(int index){
       return familyMembers[index];
   }
   public int getPersonCount(){
       return personCount;
   }
   
   @Override
   public double calcLifeInsurance(int totalMonths)throws IncorrectMonthException{
       if(totalMonths<0){
           throw new IncorrectMonthException();
       }
       
     int numberOfYearsInTotalMonths=totalMonths/12;  
     int numberOfMonthsInTotalMonths=totalMonths%12;
     
     return (numberOfYearsInTotalMonths*calcYearlyInstallment()+numberOfMonthsInTotalMonths*calcMonthlyInstallment());
   }
   
   @Override
   public double calcMonthlyInstallment(){
       double monthlyInstallment=0;
       for(int i=0;i<personCount;i++){
           if(familyMembers[i].getAge()<=10 || familyMembers[i].getAge()>=60){
           monthlyInstallment=MONTHLY_INSTALLMENT-(0.2*MONTHLY_INSTALLMENT);
           }
           else{
               monthlyInstallment=MONTHLY_INSTALLMENT;
           }
           monthlyInstallment=calcFamilyDiscount(monthlyInstallment);
       }
       return monthlyInstallment;
   }
   
   @Override
   public double calcYearlyInstallment(){
      double yearlyInstallment=0;
       for(int i=0;i<personCount;i++){
           if(familyMembers[i].getAge()<=10 || familyMembers[i].getAge()>=60){
           yearlyInstallment=YEARLY_INSTALLMENT_ONETIME_PAYMENT-(0.2*YEARLY_INSTALLMENT_ONETIME_PAYMENT);
           }
           else{
               yearlyInstallment=YEARLY_INSTALLMENT_ONETIME_PAYMENT;
           }
           yearlyInstallment=calcFamilyDiscount(yearlyInstallment);
       }
       return yearlyInstallment; 
   }
   @Override
   public double calcExemption(int totalMonths) throws IncorrectMonthException{
       if(totalMonths<0){
           throw new IncorrectMonthException();
       }
       return (super.calcLifeInsurance(totalMonths)*personCount)-this.calcLifeInsurance(totalMonths);
   }
   
   public double calcFamilyDiscount(double valueBasedOnAge){
       if(personCount==4){
           valueBasedOnAge=valueBasedOnAge-(0.15*valueBasedOnAge);
       }
       else if(personCount>=5){
           valueBasedOnAge=valueBasedOnAge-(0.2*valueBasedOnAge);
       }
       return valueBasedOnAge;
       
   }
   
   @Override
   public String toString(){
       return "Hi";
   }
}
