package Java;

public class UberX extends Car{
    String brand;
    String model;

    // Coinidir con clase padre
    public UberX(String license, Account driver, String brand, String model){
        // Método constructor de la clase padre(referencia a sus métodos y atributos)
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }


    @Override
    void printDataCard() {
        super.printDataCard();
        System.out.println("Model: " + model + "Brand: " + brand);
    }
}
