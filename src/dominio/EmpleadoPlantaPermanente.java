package dominio;

public class EmpleadoPlantaPermanente extends Empleado {

	private Integer antiguedad;

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;

	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public Double getCalculoAntiguedad() {
		return (Double) (getAntiguedad() * 100.00);
	}

	@Override
	public Double getMonto() {
		return super.getMonto() + getCalculoAntiguedad();
	}

	@Override
	public Double getValorHora() {
		return 300.00;
	}
}
