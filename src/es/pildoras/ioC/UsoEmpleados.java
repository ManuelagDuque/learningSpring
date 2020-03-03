package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // CREACIÓN DE OBJETOS DE TIPO EMPLEADO
		 * 
		 * Empleados empleado1 = new DirectorEmpleado();
		 * 
		 * // USO DE LOS OBJETOS CREADOS System.out.println(empleado1.getTareas());
		 */

		// 4 pasos a seguir para poder usar el contenedor de spring

		// 1. crear un contexto (cargar un archivo XML)

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");

		// 2. Pedir Bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		//Utilizar el objeto
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		
		//Cerrar el contexto (cerrar el archivo XML)
		contexto.close();

	}

}
