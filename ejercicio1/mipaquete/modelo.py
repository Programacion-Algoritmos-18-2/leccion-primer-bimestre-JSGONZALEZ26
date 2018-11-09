class Empleado(object):
#Constructor
	def __init__(self):

		self.nombre = ""
		self.apellido = ""
		self.cedula = ""
		self. comision_fija = 0.0
#Creación de Getters & Setters
	def setNombre(self, m):
		self.nombre = m

	def getNombre(self):
		return self.nombre

	def setApellido(self, n):
		self.apellido = n
		
	def getApellido(self):
		return self.apellido

	def setCedula(self, o):
		self.cedula = o

	def getCedula(self):
		return self.cedula

	def setComisionFija(self, p): 
		self.comision_fija = p

	def getComisionFija(self):
		return self.comision_fija
#Presentando Datos
	def presentarDatos(self):
		cadena = "Informacion de %s %s\n\tCedula: %s" % (self.getNombre(), self.getApellido(), self.getCedula())
		return cadena

#class EmpleadoFijo(Empleado):

#	def __init__(self):
#		super(Empleado, self).__init__()
#		self.sueldoFijo = 0.0
#		self.descuentoSeguro = 0.0

#	def setSueldoFijo(self, m):
#		self.sueldoFijo = m

#	def getSueldoFijo(self):
#		return self.sueldoFijo

#	def setDescuentoSeguro(self, n):
#		self.descuentoSeguro = n

#	def getDescuentoSeguro(self):
#		return self.descuentoSeguro

#	def calcularSueldoFinal(self, self.getSueldoFijo(), self.DescuentoSeguro()):
#		sueldo = a-b
#		return sueldo 


class EmpleadoPorHoras(Empleado):
#Constructor De la clase Hija
	def __init__(self):
		super(EmpleadoPorHoras, self).__init__()
		self.numeroHoras = 0
		self.valorHora = 0.0
# Getters & Setters
	def setNumeroHoras(self, n):
		self.numeroHoras = n

	def getNumeroHoras(self):
		return self.numeroHoras

	def setValorHora(self, m):
		self.valorHora = m

	def getValorHora(self):
		return self.valorHora
#Calculo de Sueldo
	def calcularSueldoFinal(self):		
		sueldoHoras = (self.numeroHoras*self.valorHora)+self.comision_fija	
		return sueldoHoras

	def presentarDatos(self):
		cadena = "%s\n\tNumero de Horas: %s\n\tValor por Hora: %s\n\tSueldo Final: %s" % (super(EmpleadoPorHoras, self).presentarDatos(), self.getNumeroHoras(), self.getValorHora(), self.calcularSueldoFinal()) 
		return cadena

#class EmpleadoPorSemana(Empleado):

#	def __init__(self):
#		super(Empleado, self).__init__()
#		self.numeroSemanas = 0
#		self.valorSemanal = 0.0