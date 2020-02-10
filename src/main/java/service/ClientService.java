package service;

import entity.Client;

import java.util.List;

public interface ClientService {
    void register(Client client);

    Client login(String name);

    List<Client> findAll();
}
