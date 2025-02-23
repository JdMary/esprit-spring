package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Menu;
import com.example.springcrashcourses.entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    //1.5. liste des restaurants ayant une capacité supérieur à 100 (paramètre) et dont la chaine de restauration a été crée avant 2020 (paramètre)
    List<Menu> findAllByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float montant);


    //2.1 List nom Menu Par le type Menu Ordonne Par PrixTotal
    @Query("SELECT m.typeMenu FROM Menu m where m.typeMenu =: type order by m.prixTotal")
    List<TypeMenu> retrieveMenuNames(@Param("type") TypeMenu type);

    //2.2 list Menu Par TypeComposant (exemple : les menus contenant de la viande blanche)
    @Query("SELECT m FROM Menu m JOIN m.composantList c JOIN c.detailComposant d WHERE d.typeComposant = :typeComposant")
    List<Menu> retrieveMenuByTypeComposant(@Param("typeComposant") String typeComposant);
}