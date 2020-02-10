package dao;

import entity.Doctor;

public interface DoctorDao extends CrudDao<Doctor, Long> {
    Doctor findByName(String name);
}
