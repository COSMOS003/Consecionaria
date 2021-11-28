package com.garcia;

import com.garcia.dao.ClienteDao;
import com.garcia.model.Cliente;
import com.garcia.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //Cliente cliente = new Cliente("1450", "Carlos Peres", "Cochabamba", "Av. Ayacucho s/n", 4401411);
        //Cliente laura = new Cliente("1451", "Carlos Peres", "Cochabamba", "Av. Ayacucho s/n", 4401413);
        //Cliente roberto = new Cliente("1452", "Roberto Claros", "Coch", "Calle Junin s/n", 4422233);
        //Cliente lorena = new Cliente("1453", "Lorena Peredo", "Cochabamba", "Av. Heroinas s/n", 4400004);
        //Cliente jose = new Cliente("1454", "Jose Jose Caceres", "Cochabamba", "Calle Sucre s/n", 4405451);
        //Cliente maria = new Cliente("1455", "Maria Vargas", "Cochabamba", "Calle Bolivar s/n", 4400012);
        //Cliente luis = new Cliente("1456", "Luis Villaroel", "Cochabamba", "Av. Blanco Gaindo  s/n", 4400971);
        //Cliente carmen = new Cliente("1457", "Carmen Canedo", "Cochabamba", "Av. Alnina Patiño s/n", 4112200);


        //CRUB tabla clientes
        ClienteDao clienteDao = new ClienteDao();


        //CREATE
        //ClienteDao clienteDao = new ClienteDao();
        //clienteDao.addCliente(laura);
        //clienteDao.addCliente(roberto);
        //clienteDao.addCliente(lorena);
        //clienteDao.addCliente(jose);
        //clienteDao.addCliente(maria);
        //clienteDao.addCliente(luis);
        //clienteDao.addCliente(carmen);


        //READ
        List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);

        }

        //UPDATE
        Cliente cliente = new Cliente("1450", "Fernando Rios", "Cochabamba", "Av. 6 de agosto s/n", 4400900);
        clienteDao.updateCliente(cliente);


        //DELETE
        clienteDao.deleteCliente("1450");
        clienteDao.deleteCliente("1456");

    }
}
