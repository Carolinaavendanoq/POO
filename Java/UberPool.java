package Java;

public class UberPool extends Car{
    String brand;
    String model;

    // Coinidir con clase padre
    public UberPool(String license, Account driver, String brand, String model){
        // Método constructor de la clase padre(referencia a sus métodos y atributos)
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}
