import java.util.HashMap;

public class Implementacion implements iMetodo {
	
	HashMap<Integer, Clientes> hasMapClientes =new HashMap<Integer, Clientes>();

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		hasMapClientes.put(cliente.getIdCliente(), cliente);
		
	}

	@Override
	public void depositar(Clientes cliente, float dinero) {
		hasMapClientes.put(cliente.getIdCliente(), cliente);
		
	}

	@Override
	public void retirar(Clientes cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clientes buscar(Clientes cliente) {
		// TODO Auto-generated method stub
		return hasMapClientes.get(cliente.getIdCliente());
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}
	
	public void depositoEfectivo(Clientes cliente, float dinero) {
		// TODO Auto-generated method stub

		if (dinero <= 10000) {
			float saldoFinal = cliente.getDinero() + dinero;
			cliente.setDinero(saldoFinal);
			System.out.println("Se ingreso correctamente la cantidad " + dinero + " a su saldo \n");
		} else {
			System.out.println("No es posible continuar con la operacion \n Limite de efectivo excedido");
		}

	}
	
	public void retiraEfectivo(Clientes cliente, float saldo) {
		// TODO Auto-generated method stub
		if (saldo <= 10000) {
			float saldoFinal = cliente.getDinero() - saldo;
			cliente.setDinero(saldoFinal);
			System.out.println("Se retiro correctamente la cantidad " + saldo + " de su cuenta \n");
		} else {
			System.out.println("Limite excedido");
		}

	}

	public boolean validaBillete(float valor) {
		float[] billetes = { 20, 50, 100, 200, 500, 1000 };
		boolean Valido = false;

		for (float billete : billetes) {
			if (billete==valor) {
				Valido = true;
				}
	}
		return Valido;
	}
	public void contar() {
		hasMapClientes.size();
	}
}
