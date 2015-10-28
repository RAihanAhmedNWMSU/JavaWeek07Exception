/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class Driver 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        //1. Create an object named 'familyHealth' of the FamilyHealthInsurance
        //class and pass the int argument value as 4.
       FamilyHealthInsurance familyHealth=new FamilyHealthInsurance(4);
        //2. Declare and initialize a Scanner object named 'scanner' to read
        //from the file Person.txt 
        Scanner scanner=new Scanner(new File("Person.txt"));
        //3. Declare double variable to stores age, String variable to stores
        //first Name, String variable to stores last name, String variable to 
        //store gender.
        double age;
        String firstName,lastName,gender;
        //4. while Person.txt has more data {
        System.out.println("toString() method of Person class:");
        while(scanner.hasNext()){
        //  Read in the data, and store them to the respective variables.
            age=scanner.nextDouble();
            firstName=scanner.next();
            lastName=scanner.next();
            gender=scanner.next();
        //  Create an object named 'person' of the Person class  
            Person person=new Person(age, firstName, lastName, gender);
        //  and pass the read values as parameters.
        //  Print the 'person' object
            System.out.println(person.toString());
        //  Pass the 'person' object as parameter for familyHealth.addPerson()
            try{
            familyHealth.addPerson(person);
            }
            catch(IllegalFamilyMemberException e){
                System.out.println("Trying to add Illegal Family Member");
            }
           //  Note: Write the above statement using try and catch block. Mention 
        //  the appropriate exception in catch block and print the exception.
            //  For example: familyHealth.addPerson();
            
         } 
            
        
        
          System.out.println("*********************************************");
         
        //5. Print the "Monthly installment in Family health insurance class: $"
        //using 'familyHealth' object.
        // Note: Limit the output of calcMonthlyInstallment() to 2 decimal
        //points.
        System.out.println("Testing the calcMontlyInstallment() of "
                + "FamilyHealthInsurance:");
        
        System.out.println("Monthly installment in Family health insurance class: $"+String.format("%.2f",familyHealth.calcMonthlyInstallment()));
        //6. Print the "Yearly installment in Family health insurance class: $"
        //  using 'familyHealth' object
        // Note: Limit the output of calcYearlyInstallment() to 2 decimal points.
         System.out.println("\nTesting the calcYearlyInstallment() "
                + "of FamilyHealthInsurance:");
        System.out.println("Yearly installment in Family health insurance class: $"+String.format("%.2f",familyHealth.calcYearlyInstallment()));
        //7. Print the "Life insurance in Family health insurance class: $" 
        //  using 'familyHealth' object
        //      For example: familyHealth.calcLifeInsurance(42);
       
        //  Note: Write the above statement using try and catch block. Mention 
        //  the appropriate exception in catch block and print the exception.
        //  Note: Limit the output of calcLifeInsurance() to 2 decimal points.
        System.out.println("\nTesting the calcLifeInsurance() "
                        + "of FamilyHealthInsurance:");
         try{
        System.out.println("Life insurance in Family health insurance class: $"+String.format("%.2f",familyHealth.calcLifeInsurance(42)));
        }
        catch(IncorrectMonthException e){
            System.out.println("Incorrect Month Exception Caught");
        }

        //8. Print the "Exemption in life insurance in Family health insurance class: $"
        //  using the 'familyHealth' object
        //      For example: familyHealth.calcExemption(40));
        //  Note: Write the above statement using try and catch block. Mention 
        //  the appropriate exception in catch block and print the exception.
        //  Note: Limit the output of calcExemption() to 2 decimal points.
           System.out.println("\nTesting the calcExemption() of "
                         + "FamilyHealthInsurance:");
        try{
        System.out.println("Exemption amount in life insurance in Family health insurance: $"+String.format("%.2f",familyHealth.calcExemption(40)));
        }
        catch(IncorrectMonthException e){
            System.out.println("Incorrect Month Exception Caught");
        }
              
                
        System.out.println("*********************************************");
        //9. Print the "toString method of FamilyHealthInsurance:"
        //  System.out.println(familyHealth);
                System.out.println("\ntoString method of FamilyHealthInsurance:");
             System.out.println(familyHealth.toString());   
        System.out.println("*********************************************");
                
        // Create an object named 'person1' of the Person class and pass parameter
        //  6.0, "Calton", "James", "Male"
        //
         Person person1=new Person(6.0, "Calton", "James", "male");
            //Polymorphic substitution
        
        //10.Create an Health object reference 'health' and refer it to 
        // an object of type PersonalHealthInsurance and pass 'person1' as parameter.
        Health health=new PersonalHealthInsurance(person1);
            //Late Binding Polymorphism
       
        //11. Print the "Monthly installment in Personal health insurance class: $"
        // using the 'health' object reference.
        // Note: Limit the output of calcMontlyInstallment() to 2 decimal points.
                 System.out.println("\nTesting the calcMontlyInstallment() "
                    + "of PersonalHealthInsurance:");
        System.out.println("Monthly installment in Personal health insurance class: $"+String.format("%.2f",health.calcMonthlyInstallment()));
        //12. Print the "Yearly installment in Personal health insurance class: $"
        // using the 'health' object reference.
        // Note: Limit the output of calcYearlyInstallment() to 2 decimal points.
        System.out.println("\nTesting the calcYearlyInstallment() of "
                    + "PersonalHealthInsurance:");
        System.out.println("Yearly installment in Personal health insurance class: $"+String.format("%.2f",health.calcYearlyInstallment()));
        //13. Print the "Life insurance in Personal health insurance class: $" 
        // using the 'health' object
        // For example: health.calcLifeInsurance(42);
        // Note: Write the above code using try and catch block. Mention 
        // the appropriate exception in catch block and print the exception.
        // Note: Limit the output of calcLifeInsurance() to 2 decimal points.
        System.out.println("\nTesting the calcLifeInsurance() "
                        + "of PersonalHealthInsurance:"); 
       try{
           System.out.println("Life insurance in Personal health insurance with Exemption: $"+String.format("%.2f",health.calcLifeInsurance(42)));
       }
       catch(IncorrectMonthException e){
           System.out.println("Incorrect Month Exception Caught");
       }
        //14. Print the "Exemption in life insurance in Personal health insurance class: $"
        // using 'health' object
        // For example: health.calcExemption(40));
        // Note: Write the above code using try and catch block. Mention 
        //  the appropriate exception in catch block and print the exception.
        // Note: Limit the output of calcExemption() to 2 decimal points.
         System.out.println("\nTesting the calcExemption() of "
                        + "PersonalHealthInsurance:");
         try{
        System.out.println("Exemption amount in life insurance in Personal health insurance: $"+String.format("%.2f",health.calcExemption(40))); 
            // Casting Objects
         }
         catch(IncorrectMonthException e){
             System.out.println("Incorrect Month Exception Caught");
         }
        //15. Create an FamilyHealthInsurance object 'familyCasting' and 
        // refer it to an object type of JointFamilyInsurance and pass the 
        // int argument as 3.
        FamilyHealthInsurance familyCasting=new JointFamilyInsurance(3);
        //16. Create an JointFamilyInsurance object 'jointCasting' and
        // refer it to 'familyCasting' object and cast it.
        JointFamilyInsurance jointCasting=(JointFamilyInsurance)familyCasting;
        //17. Create an FamilyHealthInsurance object variable 'familyCasting2' and
        // refer it to an object type of NuclearFamilyInsurance and pass the 
        // int argument as 3.
        FamilyHealthInsurance familyCasting2=new NuclearFamilyInsurance(3);
        //18. Create an NuclearFamilyInsurance object 'nuclearCasting'
        // and refer it to 'familyCasting2' object and cast it.
        NuclearFamilyInsurance nuclearCasting=(NuclearFamilyInsurance)familyCasting2;
        
        //19. Create an PersonalHealthInsurance object 'personalInsurance' and pass
        // the 'person1' object as parameter.
        // Print the "toString method of PersonalHealthInsurance:"
         System.out.println("*********************************************");
         System.out.println("\ntoString method of PersonalHealthInsurance:");
        
        PersonalHealthInsurance personalInsurance=new PersonalHealthInsurance(person1);
        System.out.println(personalInsurance.toString());
        
        //20 .Uncomment the below code.You can observe exceptions on the console. 
        // Explain each exception in the comment after the statement where the 
        // exception occurs with your own words.
    
 
        // An exception of 'ArrayIndexOutOfBoundsException' occurs as we try to insert an element in the
        // Person array whose length is 4 (as we give 4 values in Person.txt ), using the instance familyHealth of FamilyHealthInsurance Class
//    try 
//        {   
//            familyHealth.addPerson(person1);
//        } catch (IllegalFamilyMemberException ex) 
//        {
//            System.out.println(ex.getMessage());
//        }
        
        // A totalMonth Value of -10 is passed to the calcLifeInsurance method which checks
        // if the totalMonth value is less than 0. The exception is caught and a message 'null' is printed.
       // try 
      // {
        //    familyHealth.calcLifeInsurance(-10);
      //  } catch (IncorrectMonthException ex) {
    //        System.out.println(ex.getMessage());
  //          System.out.println(ex.getMessage());
//        }
        
     
        // A totalMonth Value of -20 is passed to the calcExemption method which checks
        // if the totalMonth value is less than 0. The exception is caught and a message 'null' is printed.    
//        try 
//        {
//            health.calcExemption(-20);
//        } 
//        catch (IncorrectMonthException ex) 
//        {
//            System.out.println(ex.getMessage());
//      }
        
        
        
    }
}
