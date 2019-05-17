

package controller;

import dao.productosDAO;
import entity.productosTO;
import java.util.List;


public class productosBll {
    productosDAO dao;
    
    public productosBll() {
        dao = new productosDAO();
    }
    public List<productosTO> productosListar() throws Exception{
        return dao.readAll();
    }
    
}
