public class CalculadorBisiesto {

	private int anio;
	public CalculadorBisiesto(int _anio) {
		anio=_anio;
		
		//validaciones
	}

	public boolean value() {
		return anioBisiesto() && !(anioNormalAtipico());
	}

	private boolean anioBisiesto() {
		return (anio%4)==0;
	}

	private boolean anioNormalAtipico() {
		return (anio%100)==0 && !((anio%400)==0);
	}

}