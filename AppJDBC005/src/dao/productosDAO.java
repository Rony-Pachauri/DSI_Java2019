

package dao;


import database.accesoDB;

import entity.productosTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import service.INeptuno;


public class productosDAO implements INeptuno<productosTO>{
    Connection cn;
    String sql;
    PreparedStatement ps;
    ResultSet rs;
    productosTO productos;

    @Override
    public void create(productosTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(productosTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(productosTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<productosTO> readAll() throws Exception {
        List<productosTO> lista= new ArrayList<>();
        try{
            //obtener un objeto connection
            cn=accesoDB.getConnection();
            sql="select * from productos";
            //crear un objeto PreparedStatement
            ps=cn.prepareStatement(sql);
            //ejecutar comandos
            rs=ps.executeQuery();
            while(rs.next()){
                productos = new productosTO();
                productos.setIdproducto(rs.getString(1));
                productos.setDescripcion(rs.getString(2));
                productos.setIdlinea(rs.getInt(3));
                productos.setPreciocompra(rs.getInt(4));
                productos.setPrecioventa(rs.getInt(5));
                productos.setStock(rs.getInt(6));
                //adicionar a la lista
                lista.add(productos);
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
    public productosTO findForID(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
