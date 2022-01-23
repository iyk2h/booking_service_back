package com.example.booking_service_01.service;

import javax.servlet.http.HttpServletRequest;

import com.example.booking_service_01.dto.AdminDTO;

public interface AdminService {
    AdminDTO findByAid(String aid);
    boolean checkAdminRole(String aid, HttpServletRequest request);
    boolean checkAid(String aid);
    String insertAdminDto(AdminDTO adminDTO);
    void delete(AdminDTO admindDto);
    String update(AdminDTO adminDTO);
    boolean admin_login(String aid ,String pw);
}
