
public interface iMetodo {
	public void guardar(Clientes cliente);

	public void depositar(Clientes cliente, float dinero);

	public void retirar(Clientes cliente);

	public Clientes buscar(Clientes cliente);

	public void listar();
}
