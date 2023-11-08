import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idCliente;
		String nombre;
		String apaterno;
		float dinero;

		Implementacion imp = new Implementacion();
		Clientes cliente = null;

		Clientes c1 = new Clientes(12345, "Jose", "Gonzalez", 10000);

		imp.guardar(c1);

		Scanner lectura = null;

		int menuP, subMenu;

		float suma = 0;

		do {
			System.out.println("MENU BANCOMER BIENVENIDO");
			System.out.println("1---Alta cliente");
			System.out.println("2---Consultar saldo");
			System.out.println("3---Deposito en efectivo");
			System.out.println("4---Retiro en efectivo");
			System.out.println("5---Salir");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {

			case 1:
				System.out.println("Ingresa el ID para el cliente");
				lectura = new Scanner(System.in);
				idCliente = lectura.nextInt();

				System.out.println("Ingresa su Nombre");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Ingresa el Apellido");
				lectura = new Scanner(System.in);
				apaterno = lectura.nextLine();

				System.out.println("Ingresa el deposito inicial");
				lectura = new Scanner(System.in);
				dinero = lectura.nextFloat();

				// Guardar
				cliente = new Clientes(idCliente, nombre, apaterno, dinero);
				imp.guardar(cliente);
				System.out.println("Se guardo correctamente " + cliente.getNombre());
				break;

			case 2:
				System.out.println("Ingresa el id del cliente");
				lectura = new Scanner(System.in);
				idCliente = lectura.nextInt();

				cliente = new Clientes(idCliente);
				cliente = imp.buscar(cliente);

				System.out.println("Cuentas con la siguiente cantidad: " + cliente.getDinero());
				break;

			case 3:
				System.out.println("Ingresa el id del cliente");
				lectura = new Scanner(System.in);
				idCliente = lectura.nextInt();
				
				cliente = new Clientes(idCliente);
				cliente = imp.buscar(cliente);

				System.out.println("Ingresa el monto que deseas depositar(Limite permitido S10,000)");
				lectura = new Scanner(System.in);
				float valor = lectura.nextFloat();
				suma += valor;
				imp.depositoEfectivo(cliente, suma);
				System.out.println("Su saldo actual es " + cliente.getDinero() + "\n");
				break;

			case 4:
				System.out.println("Ingrese su numero de cliente");
				lectura = new Scanner(System.in);
				idCliente = lectura.nextInt();
				
				cliente = new Clientes(idCliente);
				cliente = imp.buscar(cliente);

				System.out.println("Cuanto deseas retirar?");
				lectura = new Scanner(System.in);
				dinero = lectura.nextFloat();
				System.out.println("Ingrese la demominacion de billetes que desee recibir");
				System.out.println("20, 50, 100, 200, 500, 1000");
				lectura = new Scanner(System.in);
				valor = lectura.nextFloat();
				if (imp.validaBillete(valor) == true) {

					suma = dinero / valor;
					imp.retiraEfectivo(cliente, dinero);
					System.out.println("Se retiran " + suma + " billetes de " + valor);
					System.out.println("Saldo acutual es " + cliente.getDinero() + "\n");

				} else {
					System.out.println("Billete no valido");
				}
				break;
			case 5:
				break;
				default:
					break;
				
			}

		} while (menuP < 5);

	}

}
