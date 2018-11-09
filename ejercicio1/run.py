#Importe del paquete
from mipaquete.modelo import *

#Instancia de la clase
e = Empleado()
e.setNombre("Luis")
e.setApellido("Benitez")
e.setCedula("110001")
#Presentar Datos
print(e.presentarDatos())

#Nuevo Objeto
f = EmpleadoPorHoras()

nombre = input("Ingrese su nombre:\n")
f.setNombre(nombre)
f.setApellido("Andrade")
f.setCedula("112233")
f.setNumeroHoras(15)
f.setValorHora(20.2)
f.setComisionFija(10)
print(f.presentarDatos())

#Nuevo Objeto
g = EmpleadoFijo()

g.setNombre("Ana")
g.setApellido("Diaz")
g.setCedula("223344")
g.setSueldoFijo(300.2)
g.setDescuentoSeguro(10)
comision = input("Ingrese comision:\n")
comision = float(comision)
g.setComisionFija(comision)
print(g.presentarDatos())

#Nuevo Objeto
h = EmpleadoPorSemana()
h.setNombre("Jose")
h.setApellido("Lopez")
h.setCedula("111401")
h.setNumeroSemanas(8)
h.setValorSemanal(24)
h.setComisionFija(35)
print(h.presentarDatos())