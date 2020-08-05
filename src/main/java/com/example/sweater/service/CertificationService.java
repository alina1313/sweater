package com.example.sweater.service;

import com.example.sweater.domain.Certifications;
import com.example.sweater.repos.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;


    public Certifications addCertification(Certifications certification){
        return certificationRepository.save(certification);
    }

    public List<Certifications> getAllCertifications() {
        return (List<Certifications>) certificationRepository.findAll();
    }

    public Certifications updateCertification(Certifications certification){
        return certificationRepository.save(certification);
    }

    public void deleteCertification(int id){
        certificationRepository.deleteById(id);
    }

}
