package com.thinkconstructive.restdemo.repo;

import com.thinkconstructive.restdemo.model.StoreInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreInformation,Integer> {
    List<StoreInformation> findByStoreName(String name);
    List<StoreInformation>findByPhoneNumber(String phoneNumber);
}
