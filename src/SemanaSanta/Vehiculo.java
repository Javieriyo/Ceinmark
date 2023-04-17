package SemanaSanta;

public class Vehiculo {
	
	private String matricula;
	private int plaza;
	private String combustible;
	private double preciodia;
	private boolean reservado;
	
	public Vehiculo() {
		this.matricula="nada";
		this.plaza=0;
		this.combustible="nada";
		this.preciodia=0.0;
		this.reservado=false;
	}
	
	public Vehiculo(String matricula, int plaza, String combustible, double preciodia, boolean reservado) {
		this.matricula=matricula;
		this.plaza=plaza;
		this.combustible=combustible;
		this.preciodia=preciodia;
		this.reservado=reservado;
	}
	public String getmatricula() {
		return this.matricula;}
	public int getplaza() {
		return this.plaza;}
	public String getcombustible() {
		return this.combustible;}
	public double getpreciodia() {
		return this.preciodia;}
	public boolean getreservado() {
		return this.reservado;}
	
	
	public void setmatricula(String matricula) {
		this.matricula=matricula;}
	public void setplaza(int plaza) {
		this.plaza=plaza;}
	public void setcombustible(String combustible) {
		this.combustible=combustible;}
	public void setpreciodia(double preciodia) {
		this.preciodia=preciodia;}
	public void setreservado(boolean reservado) {
		this.reservado=reservado;}

	public String toString() {
		return "matricula "+getmatricula()+" plaza "+getplaza()+" combustible "+getcombustible()+"\n\t"
				+"precio por dia "+getpreciodia();
		
	}

}
