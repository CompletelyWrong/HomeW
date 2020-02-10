package dao.impl;

import dao.AppointmentDao;
import entity.Appointment;
import entity.Client;
import entity.Doctor;

import java.time.LocalDateTime;

public class AppointmentDaoImpl extends AbstractCrudDaoImpl<Appointment> implements AppointmentDao {
    @Override
    public Appointment findByDoctor(Doctor doctor) {
        return keyToEntity.values().stream()
                .filter(x -> x.getDoctor().equals(doctor))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No appointment with such doctor"));
    }

    @Override
    public Appointment findByTime(LocalDateTime localDateTime) {
        return keyToEntity.values().stream()
                .filter(x -> x.getDateTime().equals(localDateTime))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No appointment for such time"));
    }

    @Override
    public Appointment findByClient(Client client) {
        return keyToEntity.values().stream()
                .filter(x -> x.getClient().equals(client))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No appointment with such client"));
    }

    @Override
    public Appointment findByRoom(String room) {
        return keyToEntity.values().stream()
                .filter(x -> x.getRoom().equals(room))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No appointment with such room"));
    }
}
