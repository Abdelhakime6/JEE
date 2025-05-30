package Inventory.dao.repositories;

import Inventory.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface videosrepository  extends JpaRepository<Video, Long> {

    List<Video> findByName(String name);
}
