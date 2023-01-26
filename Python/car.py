from account import Account
class Car:
    id = int
    license = str
    driver = Account("", "")
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver

# Revisar modificadores de acceso
# Public name
# Protected _address (accesible para la clase misma y subclases)
# Private __password