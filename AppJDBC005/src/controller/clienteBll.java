

package controller;

import dao.clienteDAO;
import entity.clienteTO;
import java.util.List;

public class clienteBll {
    clienteDAO dao;

    public clienteBll() {
        dao = new clienteDAO();
    }
    public List<clienteTO> clientesListar() throws Exception{
        return dao.readAll();
    }
}
