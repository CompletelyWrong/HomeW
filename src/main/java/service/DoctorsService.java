package service;

import entity.Doctor;

import java.util.List;

public interface DoctorsService {
    void register(Doctor doctor);

    Doctor login(String name);

    List<Doctor> findAll();

    List<Doctor> findBySpecialization(String specialization);
}
