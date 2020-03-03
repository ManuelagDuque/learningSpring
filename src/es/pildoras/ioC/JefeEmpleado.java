package es.pildoras.ioC;

public class JefeEmpleado implements Empleados {
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	public String getTareas() {

		return "Gestiono los empleados de mi sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con correcciones:" + informeNuevo.getInforme();
	}

}
