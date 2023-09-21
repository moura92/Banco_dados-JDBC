package aplicação;

import java.util.Date;
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

		System.out.println();
		System.out.println("=== Teste 03: Vendedor findAll ===");
		lista = vendedorDao.findAll();
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("=== Teste 04: Vendedor insert ===");
		Vendedor novoVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(novoVendedor);
		System.out.println("Inserido! Novo ID: " + novoVendedor.getId());

		
		System.out.println();
		System.out.println("=== Teste 05: Vendedor update ===");
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Martha Wine");
		vendedorDao.update(vendedor);
		System.out.println("Update completed");
	}
}