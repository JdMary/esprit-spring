package com.example.springcrashcourses.controllers;

import com.example.springcrashcourses.services.IMenuService;
import com.example.springcrashcourses.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuController {
    IMenuService menuService;
}
