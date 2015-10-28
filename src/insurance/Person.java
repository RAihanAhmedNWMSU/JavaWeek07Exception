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
public class Person {
    /**
     * Represents the age of the person.

     */
    private double age;
    
    /**
     *  Represents the first name of the person.
     */
    private String firstName;
    /**
     * Represents the last name of the person.
     */
    private String lastName;
    /**
     *  Represents the gender of the person
     */
    private String gender;

    /**
     * Implement the Parameterized constructor to initialize all the above variables
     * @param age Assign it to age variable.
     * @param firstName Assign it to firstName variable.
     * @param lastName Assign it to lastName variable.
     * @param gender Assign it to gender variable.
     */
    public Person(double age, String firstName, String lastName, String gender) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    /**
     * @return the age 
     */
    public double getAge() {
        return age;
    }

    /**
     * @param age The new age of the person.
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * @return The first name of the person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The new first name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The last name of the person.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The new last name of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender The gender of the person to be set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * All the private variable are separated by one space. Print the String values left 
 justified by 10 spaces and print the floating point values right 
 justified by 3 spaces with two number decimal values. 
     * @return 
     */
    @Override
   public String toString(){
        return String.format("%-10s %-10s %-10s %3.2f", firstName,lastName,gender,age);
   } 
    
}
