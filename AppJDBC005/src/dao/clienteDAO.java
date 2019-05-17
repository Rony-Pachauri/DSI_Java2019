

package dao;

import database.accesoDB;
import entity.clienteTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import service.INeptuno;


public class clienteDAO implements INeptuno<clienteTO>{

    Connection cn;
    String sql;
    PreparedStatement ps;
    ResultSet rs;
    clienteTO cliente;
    @Override
    public void create(clienteTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(clienteTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(clienteTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<clienteTO> readAll() throws Exception {
        List<clienteTO> lista= new ArrayList<>();
        try{
            //obtener un objeto connection
            cn=accesoDB.getConnection();
            sql="select * from clientes";
            //crear un objeto PreparedStatement
            ps=cn.prepareStatement(sql);
            //ejecutar comandos
            rs=ps.executeQuery();
            while(rs.next()){
                cliente = new clienteTO();
                cliente.setIdcliente(rs.getString(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setRucdni(rs.getString(4));
                cliente.setTelefono(rs.getString(5));
                //adicionar a la lista
                lista.add(cliente);
            }
            rs.close();
            ps.close();
        }
        catch (Exception e){
            throw e;
        }
        finally{
            cn.close();
        }
        return lista;
    }

    @Override
    public clienteTO findForID(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
