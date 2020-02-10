package dao.impl;

import dao.ClientDao;
import entity.Client;

public class ClientDaoImpl extends AbstractCrudDaoImpl<Client> implements ClientDao {
    @Override
    public Client findByName(String name) {
        return keyToEntity.values().stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No client with such name"));
    }
}
