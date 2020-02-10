package dao.impl;

import dao.CrudDao;

import java.util.*;

public abstract class AbstractCrudDaoImpl<E> implements CrudDao<E, Long> {
    protected Map<String, E> keyToEntity = new HashMap<String, E>();

    public E save(E entity) {
        if (Objects.isNull(entity) || keyToEntity.containsValue(entity)) {
            throw new IllegalArgumentException("entity is empty or already exist");
        }

        Long id = getId();
        return keyToEntity.put(id.toString(), entity);
    }

    public void update(E entity, Long entityId) {
        if (!keyToEntity.containsKey(entityId.toString())) {
            throw new IllegalArgumentException("no such id presented");
        }
        keyToEntity.replace(entityId.toString(), entity);
    }

    public E findById(Long entityId) {
        if (!keyToEntity.containsKey(entityId.toString())) {
            throw new IllegalArgumentException("no such id presented");
        }
        return keyToEntity.get(entityId.toString());
    }

    public List<E> findAll() {
        return new ArrayList<>(keyToEntity.values());
    }

    private Long getId() {
        return (long) (keyToEntity.keySet().size() + 1);
    }
}
