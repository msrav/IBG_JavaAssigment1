
package javaappclasses;


public class Car {
    public Boolean StartButton = false;
    public Boolean Brake;
    int VehSpeed = 0;
    float Fuel = 0.0f;
    String Gear = "Parking";
    
    
    public void start() {
        this.StartButton = true;
    }
    
    public void stop(){
        this.StartButton = false;
    }
    
    public void CurrGear(String GearSet){
        this.Gear = GearSet;
    }
    
    public void print()
    {
        if(this.StartButton == true)
           System.out.println("Car Started");
        else
           System.out.println("Car Stopped");
        
        System.out.println("Car is currently in: " +this.Gear);
    }
    
}
