package br.edu.infnet.orm;

import br.edu.infnet.orm.modelo.entidade.*;
import br.edu.infnet.orm.modelo.persistencia.ClienteDAO;
import br.edu.infnet.orm.modelo.persistencia.ColaboradorDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

		/* Insere Clientes no banco */
//		IDAO dao = new ClienteDAO();
//		Cliente cliente = new Cliente("Bruno Apostolico");
//		cliente.setContatos(new ArrayList<>());
//		cliente.getContatos().add(new Contato(TipoContato.EMAIL, "bapostolico@gmail.com"));
//		cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "21993703274"));
//		cliente.getContatos().add(new Contato(TipoContato.TELEFONE, "21993638628"));
//
//		dao.salvar(cliente);

		/* Lista Clientes do Banco */
//    	List<Cliente> clientes = dao.listaTodos();
//    	System.out.println(clientes);


//    	for (Cliente cliente : clientes) {
//			System.out.println(cliente.getContatos());
//		}

		/*Insere Colaborador */
        ColaboradorDAO dao = new ColaboradorDAO();
//		Colaborador colaborador = new Colaborador();
//		colaborador.setEmail("bapostolico@gmail.com");
//		colaborador.setNome("Bruno Apostolico");
//		colaborador.setTelefone("21993703274");

//		dao.salvar(colaborador);

		/*Lista Colaborador pelo ID */
//		Colaborador colaborador = dao.obter(1l);
//		System.out.println(colaborador);

        /* Listar todos */
//		List<Colaborador> listaTodos = dao.listaTodos();
//		System.out.println(listaTodos);

        /* Insere um Técnico que herda de Colaborador*/
//		Tecnico tecnico = new Tecnico();
//		tecnico.setNome("Priscila Apostolico");
//		tecnico.setEmail("priscilipe@gmail.com");
//		tecnico.setTelefone("21993638628");
//        tecnico.setCoren("123123123");
//        tecnico.setDiarista(true);
//        tecnico.setSexo("Feminino");
//
//        dao.salvar(tecnico);

        /* Insere um Atendente que herda de Colaborador */
//        Atendente atendente = new Atendente();
//        atendente.setNome("Eloah de Oliveira");
//        atendente.setEmail("lolo@gmail.com");
//        atendente.setTelefone("21977371703");
//        atendente.setFormacao("Ensino Fundamental");
//        atendente.setIdade(6);
//        atendente.setTurno("Dia");
//
//        dao.salvar(atendente);




    }
}