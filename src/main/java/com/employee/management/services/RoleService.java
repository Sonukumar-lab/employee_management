package com.employee.management.services;

import com.employee.management.models.Role;
import com.employee.management.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() { return roleRepository.findAll(); }
}