package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable {

	final Integer VELOCIDADMAXIMA = 80;
	private Integer cantidadDeEjes;

	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		super(patente, velocidadActual, limiteVelocidad);
	}

	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		super(patente, velocidadActual, limiteVelocidad);

		this.cantidadDeEjes = cantidadDeEjes;
	}

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	@Override
	public Boolean enInfraccion() {
		return this.getVelocidadActual() >= this.VELOCIDADMAXIMA;
	}

}
