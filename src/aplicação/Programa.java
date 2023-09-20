package aplicação;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDao vendedorDao = FabricaDao.criaVendedorDo();

		System.out.println("=== Teste 01: Vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);

		System.out.println(vendedor);
	}
}