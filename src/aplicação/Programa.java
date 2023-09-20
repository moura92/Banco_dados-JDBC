package aplicação;

import java.util.Date;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {

		Departamento depart = new Departamento(1, "Books");
		Vendedor vend = new Vendedor (21, "Bob", "bob@gmail.com", new Date(), 3000.0, depart);
		VendedorDao vendedorDao = FabricaDao.criaVendedorDo();
		
		System.out.println(vend);
	}
}