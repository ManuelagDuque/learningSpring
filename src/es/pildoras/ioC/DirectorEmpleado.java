package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {
	
	//creación de campo tipo CreacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	//Creación de constructor donde se inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gerencio procesos de la organización";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "return informe creado por el Director: " + informeNuevo.getInforme();
	}

}
