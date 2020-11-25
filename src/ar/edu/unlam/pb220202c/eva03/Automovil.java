package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo implements Imultable {

	final Integer VELOCIDADMAXIMA = 130;

	public Automovil(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		super(patente, velocidadActual, limiteVelocidad);
	}

	@Override
	public Boolean enInfraccion() {

		return this.getVelocidadActual() >= this.VELOCIDADMAXIMA;
	}

}
