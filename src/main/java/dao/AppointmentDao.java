package dao;

import entity.Appointment;
import entity.Client;
import entity.Doctor;

import java.time.LocalDateTime;

public interface AppointmentDao extends CrudDao<Appointment, Long> {
    Appointment findByDoctor(Doctor doctor);

    Appointment findByTime(LocalDateTime localDateTime);

    Appointment findByClient(Client client);

    Appointment findByRoom(String room);
}
