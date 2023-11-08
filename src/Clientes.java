
public class Clientes {
 private int idCliente;
 private String nombre;
 private String apaterno;
 private float dinero;
public Clientes() {
}
public Clientes(int idCliente) {
	this.idCliente = idCliente;
}
public Clientes(int idCliente, String nombre, String apaterno, float dinero) {
	this.idCliente = idCliente;
	this.nombre = nombre;
	this.apaterno = apaterno;
	this.dinero = dinero;
}
@Override
public String toString() {
	return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", apaterno=" + apaterno + ", dinero=" + dinero
			+ "]\n";
}
public int getIdCliente() {
	return idCliente;
}
public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApaterno() {
	return apaterno;
}
public void setApaterno(String apaterno) {
	this.apaterno = apaterno;
}
public float getDinero() {
	return dinero;
}
public void setDinero(float dinero) {
	this.dinero = dinero;
}
 
 
 
 
}
