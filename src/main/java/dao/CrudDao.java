package dao;

import java.io.Serializable;
import java.util.List;

public interface CrudDao<E, ID extends Serializable> {
    E save(E entity);

    void update(E entity, ID entityId);

    E findById(ID entityId);

    List<E> findAll();
}
