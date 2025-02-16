package com.example.springcrashcourses.services;
import com.example.springcrashcourses.entities.Menu;

import java.util.List;

public interface IMenuService{
    List<Menu> retrieveAllMenu();
    Menu addMenu(Menu c);
    Menu updateMenu(Menu c);
    Menu retrieveMenu(Long idChaine);
    void removeMenu(Long idChaine);
    List<Menu> addMenu(List<Menu> menus);
}
