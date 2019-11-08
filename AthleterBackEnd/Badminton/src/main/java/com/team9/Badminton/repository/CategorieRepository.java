package com.team9.Badminton.repository;

import com.team9.Badminton.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
    Categorie findCategorieByCategorieID(@Param("categorieID") int categorieID);
}
