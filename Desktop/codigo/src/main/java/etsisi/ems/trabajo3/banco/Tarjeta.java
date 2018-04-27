package etsisi.ems.trabajo3.banco;

import java.time.LocalDate;

public abstract class Tarjeta {

	public Cuenta mCuentaAsociada;
	String mNumero, mTitular;
	LocalDate mFechaDeCaducidad;
	
	abstract void setCuenta(Cuenta c);

	abstract void retirar(double x) throws Exception;

	//traspaso tarjeta a cuenta
	abstract void ingresar(double x) throws Exception;

	abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;

	abstract double getSaldo();

}