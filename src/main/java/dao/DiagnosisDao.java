package dao;

import entity.Client;
import entity.Diagnosis;
import entity.Doctor;

public interface DiagnosisDao extends CrudDao<Diagnosis, Long> {
    Diagnosis findByDoctor(Doctor doctor);

    Diagnosis findByDiagnosis(String diagnosis);

    Diagnosis findByClient(Client client);
}
