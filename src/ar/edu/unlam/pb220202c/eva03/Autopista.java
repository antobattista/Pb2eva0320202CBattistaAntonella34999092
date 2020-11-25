package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	
	private HashMap<Integer, Vehiculo> telepase = new HashMap<>();
	private HashSet<Vehiculo> vehiculosEnCirculacion = new HashSet<>();

	public Autopista() {
		
	}

	public Boolean registrarTelepase(Integer numeroTelpase, Vehiculo vehiculo) {

		telepase.put(numeroTelpase, vehiculo);

		return null;
	}

	public Boolean ingresarAutopista(Integer numeroTelepase) throws Exception {

		boolean puedeIngresar = true;

		if (!telepase.containsKey(numeroTelepase)) {

			puedeIngresar = false;

			throw new VehiculoNotFounException("No puede pasar");

		} 
		else 
		{
			vehiculosEnCirculacion.add(telepase.get(numeroTelepase));
		}

		return puedeIngresar;
	}

	public void salirAutpista(Vehiculo vehiculo) throws Exception {
		
		if (!vehiculosEnCirculacion.contains(vehiculo)) {

			throw new VehiculoNotFounException("El vehiculo no puede circular");

		} 
		else 
		{
			vehiculosEnCirculacion.remove(vehiculo);
		}

	}

	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente() {

		return null;
	}

	public Integer cantidadDeVehiculosENCirculacion() {

		return vehiculosEnCirculacion.size() - 1;
	}

	public HashSet<Vehiculo> getVehiculosEnCirculacion() {
		
		return vehiculosEnCirculacion;
	}

	public void setVehiculosEnCirculacion(HashSet<Vehiculo> vehiculosEnCirculacion) {
		
		this.vehiculosEnCirculacion = vehiculosEnCirculacion;
	}

}
