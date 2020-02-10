package dao.impl;

import dao.DiagnosisDao;
import entity.Client;
import entity.Diagnosis;
import entity.Doctor;

public class DiagnosisDaoImpl extends AbstractCrudDaoImpl<Diagnosis> implements DiagnosisDao {
    @Override
    public Diagnosis findByDoctor(Doctor doctor) {
        return keyToEntity.values().stream()
                .filter(x -> x.getDoctor().equals(doctor))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No diagnosis with such doctor"));
    }

    @Override
    public Diagnosis findByDiagnosis(String diagnosis) {
        return keyToEntity.values().stream()
                .filter(x -> x.getDiagnosis().equals(diagnosis))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No diagnosis with such diagnosis"));
    }

    @Override
    public Diagnosis findByClient(Client client) {
        return keyToEntity.values().stream()
                .filter(x -> x.getClient().equals(client))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No diagnosis with such client"));
    }
}
