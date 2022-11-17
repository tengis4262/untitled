package TestStudy;

public class Car extends Owner{
    private String model, brand;
    private int year;
    public void Car(String model, String brand, int year){
        this.model = model;
        this.brand = brand;
        this.year = year;
    }
    public void Accelerate(){
        System.out.println("Unnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }
    public void Honk(){
        System.out.println("Boop,Boop,Boop!!!");
    }

}
