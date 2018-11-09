#Importe del paquete
from mipaquete.modelo import *
#Instancia de la clase
e = Empleado()
e.setNombre("Luis")
e.setApellido("Benitez")
e.setCedula("1110001")
#Presentar Datos
#print(e.presentarDatos())
#Nuevo Objeto
f = EmpleadoPorHoras()
f.setNombre("Luis")
f.setApellido("Benitez")
f.setCedula("1110001")
f.setNumeroHoras(8)
f.setValorHora(8)
f.setComisionFija(35)
print(f.presentarDatos())