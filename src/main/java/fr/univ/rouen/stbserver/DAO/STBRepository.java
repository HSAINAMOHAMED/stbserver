package fr.univ.rouen.stbserver.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univ.rouen.stbserver.model.STB;

public interface STBRepository extends JpaRepository<STB,Long> {
	
	STB findById(int id);

}
