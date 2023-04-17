package ParteA;

import java.util.ArrayList;

public class Habitación {
	
	private int numero;
	private int camas;
	private boolean ventana;
	private boolean terraza;
	private float precio;
	private boolean alquilada;
	
	public Habitación() {
		this.numero=0;
		this.camas=1;
		this.ventana=false;
		this.terraza=false;
		this.precio=0.0f;
		this.alquilada=false;
	}
		
	public Habitación(int numero, int camas, boolean ventana, boolean terraza, float precio, boolean alquilada) {
		this.numero=numero;
		this.camas=camas;
		this.ventana=ventana;
		this.terraza=terraza;
		this.precio=precio;
		this.alquilada=alquilada;
	}
	
	public int getnumero() {
		return this.numero;}
	public int getcamas() {
		return this.camas;}
	public boolean getventana() {
		return this.ventana;}
	public boolean getterraza() {
		return this.terraza;}
	public float getprecio() {
		return this.precio;}
	public boolean getalquilada() {
		return this.alquilada;}
	
	public void setnumero(int numero) {
		this.numero=numero;}
	public void setcamas(int camas) {
		this.camas=camas;}
	public void setventana(boolean ventana) {
		this.ventana=ventana;}
	public void setterraza(boolean terraza) {
		this.terraza=terraza;}
	public void setprecio(float precio) {
		this.precio=precio;}
	public void setalquilada(boolean alquilada) {
		this.alquilada=alquilada;}
	
	public String toString() {
		return "id de la habitacion " + getnumero() + " numero de camas "+ getcamas() +"\n\t"+
			" ventana "+ getventana() + " terraza "+ getterraza() + "\n\t"+
			" precio "+ getprecio() + " alquilada "+ getalquilada();
				
	}
	
	//hacer que funcione el metodo
	public void pagar(float preciodia) {
		int dias =(int)(Math.random()*5+1);
		float pago =dias*preciodia;
		System.out.println("vas a pagar "+ pago+" €");
	}
	public void reservadas() {
		
	}
	
	
	
}
