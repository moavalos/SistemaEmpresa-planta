package dominio;

public class Empleado {
	
	private Integer horasTrabajadas = 0;
	private Boolean esCasado = false;;
	private Integer cantidadHijos = 0;
	private Double valorHora = 0.00;
	private Double salarioXHijo = 100.00;

	public void setHorasTrabajadas(Integer horas) {
		this.horasTrabajadas = horas;

	}

	public void esCasado(Boolean esCasado) {
		this.esCasado = esCasado;

	}

	public void setHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;

	}

	public Double getMonto() {
		return getHorasTrabajadas() * getValorHora() + getPlusFamiliar();
	}

	// ???
	private Double getPlusFamiliar() {
		Double plusFamiliar = this.esCasado() ? 100.00 : 0.00;
		plusFamiliar += this.getHijos() * 200;

		return plusFamiliar;
	}

	public Double getValorHora() {
		return this.valorHora;
	}

	private Integer getHorasTrabajadas() {
		return this.horasTrabajadas;
	}

	public Boolean esCasado() {
		return esCasado;
	}

	public Integer getHijos() {
		return cantidadHijos;
	}

}
