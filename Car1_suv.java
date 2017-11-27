
package javaappclasses;

/* Class Car1_suv extends Class Car - Subclass */
public class Car1_suv extends Car{
    private String Model = "SUV";

    /* Constructor class looks like a method with argument but has the same 
       name as Class but without a return type */ 
    public Car1_suv(String CarModel) {
        this.Model = CarModel;
        
    }
       
    @Override public void print()
    {
        super.print();
        System.out.println("Person is driving a SUV:" +Model);
    }
}
