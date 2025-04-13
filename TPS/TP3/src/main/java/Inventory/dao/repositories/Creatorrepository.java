package Inventory.dao.repositories;

import Inventory.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Creatorrepository extends JpaRepository<Creator, Long> {
    public List<Creator> findByEmail(String email);
}
