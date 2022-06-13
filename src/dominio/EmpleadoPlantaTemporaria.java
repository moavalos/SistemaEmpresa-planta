package dominio;

public class EmpleadoPlantaTemporaria extends Empleado {

	@Override
	public Double getValorHora() {
		return 200.00;
	}

	public Double sueldoTotal() {
		return (double) (getValorHora() * super.getHorasTrabajadas() + super.getPlusFamiliar()) ;
	}

}
