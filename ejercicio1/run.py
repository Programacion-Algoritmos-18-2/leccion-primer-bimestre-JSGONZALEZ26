#Importe del paquete
from mipaquete.modelo import *
#Instancia de la clase
e = Empleado()
e.setNombre("Luis")
e.setApellido("Benitez")
e.setCedula("1110001")
#Presentar Datos
print(e.presentarDatos())