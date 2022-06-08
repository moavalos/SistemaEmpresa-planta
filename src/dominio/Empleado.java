package dominio;

public class Empleado {
	
	private Integer horasTrabajadas = 0;
	private Boolean esCasado = false;;
	private Integer cantidadHijos = 0;
	private Double valorHora = 0.00;
	private Double salarioXHijo = 100.00;

	public Double getMonto() {
		//return getHorasTrabajadas() * getValorHora() + getPlusFamiliar();
		return 0.0;
	}

	private Double getPlusFamiliar() {
		/*Double plusFamiliar = this.getEsCasado() ? 100.00 : 0.00;
		plusFamiliar += this.getCantidadHijos() * 200;

		return plusFamiliar;*/
		return 0.0;
	}

	public Integer getHorasTrabajadas() {
		return this.horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Boolean getEsCasado() {
		return esCasado;
	}

	public void setEsCasado(Boolean esCasado) {
		this.esCasado = esCasado;
	}

	public Integer getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double getSalarioXHijo() {
		return salarioXHijo;
	}

	public void setSalarioXHijo(Double salarioXHijo) {
		this.salarioXHijo = salarioXHijo;
	}

}
