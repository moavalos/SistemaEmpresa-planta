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
}
