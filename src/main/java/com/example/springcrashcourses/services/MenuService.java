package com.example.springcrashcourses.services;

import com.example.springcrashcourses.entities.Menu;
import com.example.springcrashcourses.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuService implements IMenuService{
    MenuRepository menuRepository;
    @Override
    public List<Menu> retrieveAllMenu() {
        return menuRepository.findAll();
    }

    @Override
    public Menu addMenu(Menu c) {
        return menuRepository.save(c);
    }

    @Override
    public Menu updateMenu(Menu c) {
        return menuRepository.save(c);
    }

    @Override
    public Menu retrieveMenu(Long idChaine) {
        return menuRepository.findById(idChaine).get();
    }

    @Override
    public void removeMenu(Long idChaine) {
        menuRepository.deleteById(idChaine);
    }

    @Override
    public List<Menu> addMenu(List<Menu> menus) {
        return null;
    }
}
