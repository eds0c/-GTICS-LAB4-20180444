package com.example.lab4_20180444.controller;

import com.example.lab4_20180444.entity.Employees;
import com.example.lab4_20180444.repository.EmployeesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Employees")
public class EmployeesController {
    final EmployeesRepository employeesRepository;

    public EmployeesController(EmployeesRepository employeesRepository){
        this.employeesRepository = employeesRepository;
    }

    @GetMapping(value = {"/listaEmployees", ""})
    public String listarEmployees(Model model){
        List<Employees> lista = employeesRepository.findAll();
        model.addAttribute("listaEmpleados",lista);
        return "employees/listaEmployees";
    }
}
