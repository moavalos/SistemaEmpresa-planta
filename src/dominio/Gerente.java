package dominio;

public class Gerente extends EmpleadoPlantaPermanente {

	@Override
	public Double getValorHora() {
		return 400.00;
	}

	@Override
	public Double getCalculoAntiguedad() {
		return getAntiguedad() * 150.00;
	}
}
