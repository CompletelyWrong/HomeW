package dao;

import entity.Client;

public interface ClientDao extends CrudDao<Client, Long> {
    Client findByName(String name);
}
