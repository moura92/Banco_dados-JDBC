package aplicação;

import java.util.List;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDao vendedorDao = FabricaDao.criaVendedorDo();

		System.out.println("=== Teste 01: Vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);

		System.out.println(vendedor);

		System.out.println();
		System.out.println("=== Teste 02: Vendedor findByIdDepartment ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.findByDepartment(departamento);
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}
	}
}