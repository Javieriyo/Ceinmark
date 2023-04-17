package SemanaSanta;

import java.time.LocalTime;
import java.time.LocalDate;

public class Reservas {
	
	private String dni;
	private String matricula;
	private LocalDate finicio;
	private LocalTime hinicio;
	
	public Reservas() {
		this.dni="";
		this.matricula="";
	}
	
	public Reservas(String dni, String matricula, LocalDate finicio, LocalTime hinicio) {
		this.dni=dni;
		this.matricula=matricula;
		this.finicio=finicio;
		this.hinicio=hinicio;
	}
	public String getdni() {
		return this.dni;}
	public String getmatricula() {
		return this.matricula;}
	public LocalDate getfinicio() {
		return this.finicio;}
	public LocalTime hinicio() {
		return this.hinicio;}
	
	public void setdni(String dni) {
		this.dni=dni;}
	public void setmatricula(String matricula) {
		this.matricula=matricula;}
	public void setfinicio(LocalDate finicio) {
		this.finicio=finicio;}
	public void sethinicio(LocalTime hinicio) {
		this.hinicio=hinicio;}

}
