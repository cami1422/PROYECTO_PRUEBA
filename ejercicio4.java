
public class ejercicio4 {
	public class Producto {

		private String nombre;
		private int dia;
		private int mes;
		private int anio;
		private double precio;
		private boolean perecedero;
		
		public Producto(String nombre, int dia, int mes, int anio, double precio, boolean perecedero) {
			this.nombre = nombre;
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
			this.precio = precio;
			this.perecedero = perecedero;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getDia() {
			return dia;
		}

		public void setDia(int dia) {
			this.dia = dia;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getAnio() {
			return anio;
		}

		public void setAnio(int anio) {
			this.anio = anio;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public boolean Perecedero() {
			return perecedero;
		}

		public void setPerecedero (boolean perecedero) {
		}
		}
		}
