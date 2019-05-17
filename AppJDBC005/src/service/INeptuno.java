

package service;

import java.util.List;


public interface INeptuno<T> {
    //definir las firmas
    void create(T t)throws Exception;
    void update(T t)throws Exception;
    void delete(T t)throws Exception;
    List<T>readAll()throws Exception;
    T findForID(Object t)throws Exception;
}
