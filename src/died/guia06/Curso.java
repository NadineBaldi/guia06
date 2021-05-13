package died.guia06;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import died.guia06.util.Registro;

public class Curso {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	
	private Registro log;
	
	public Curso() {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
		this.creditos=0;
		this.cupo=0;
	}
	

	public Boolean inscribir(Alumno a) {
		log.registrar(this, "inscribir ",a.toString());
		return false;
	}
	
	
	
	//imprime los inscriptos en orden alfabetico
	public void imprimirInscriptos() {
		
		//condiciones necesarias para inscribirse:
		
		
		
		log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
	}


}
