package fr.univ.rouen.stbserver.service;


import java.util.List;

import fr.univ.rouen.stbserver.Dto.STBDto;

public interface STBservice {

	STBDto saveSTB(STBDto usersDto) ;

    void deleteSTB(Integer userId);

    STBDto findByID(int id);

    List<STBDto> findAll();
}
