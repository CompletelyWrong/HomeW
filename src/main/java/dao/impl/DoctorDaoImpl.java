package dao.impl;

import dao.DoctorDao;
import entity.Doctor;

public class DoctorDaoImpl extends AbstractCrudDaoImpl<Doctor> implements DoctorDao {
    @Override
    public Doctor findByName(String name) {
        return keyToEntity.values().stream()
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No doctors with such name"));
    }
}
