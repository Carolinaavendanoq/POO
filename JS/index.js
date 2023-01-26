// Lugar equivalente al punto de entrada de la app donde se declaran los objetos basados en clases

let car = new Car("AW456", new Account("Andrés Herrera", "QWE123"));
car.passenger = 4;
car.printDataCar();

let uberX = new UberX('AWS765', new Account('Andrea', 'AJD5864'), 'Chevrolet', 'Spark');
uberX.passenger = 4;
uberX.printDataCar();