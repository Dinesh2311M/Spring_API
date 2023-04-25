package com.example.ChocoShopee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChocoShopee.Model.ChocoModel;
@Repository
public interface ChocoRepo extends JpaRepository<ChocoModel, Integer> {

}
