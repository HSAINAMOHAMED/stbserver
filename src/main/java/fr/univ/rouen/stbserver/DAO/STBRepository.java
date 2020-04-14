package fr.univ.rouen.stbserver.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import fr.univ.rouen.stbserver.model.STB;
import fr.univ.rouen.stbserver.model.StbSearch;

public interface STBRepository extends Repository<STB,Long> {
	
	STB findById(int id);
	
	List<StbSearch> findAllProjectedBy();

	List<STB> findAll();

	STB delete (STB stb);
}
