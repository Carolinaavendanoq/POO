class Account: 
    id = int
    # Asignar tipo de dato 
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document):
        self.name = name
        self.document =  document
