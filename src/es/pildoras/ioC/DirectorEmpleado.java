package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {
	
	//creaci�n de campo tipo CreacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	//Creaci�n de constructor donde se inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gerencio procesos de la organizaci�n";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "return informe creado por el Director: " + informeNuevo.getInforme();
	}

}
