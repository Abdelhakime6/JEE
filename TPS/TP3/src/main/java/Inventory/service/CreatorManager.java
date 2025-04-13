package Inventory.service;

import Inventory.dao.entities.Creator;
import Inventory.dao.repositories.Creatorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatorManager implements CreatorService {
    @Autowired
    private Creatorrepository creatorrepository;

    @Override
    public Creator addCreator(Creator creator) {
       List<Creator> creators = creatorrepository.findByEmail(creator.getEmail());
       if(!creators.isEmpty()){
           System.out.println("email already used!");
           return null;
       }
       else{
          return creatorrepository.save(creator);
       }
    }

    @Override
    public Creator deleteCreator(Long id) {
       Creator creator = creatorrepository.findById(id).get();
       if (creator != null){
           creatorrepository.deleteById(id);
           return creator;
       }
       else {
           return null;
       }
    }

    @Override
    public Creator UpdateCreator(Creator creator) {
        return creatorrepository.save(creator);
    }

    @Override
    public Creator getById(Long id) {
        return creatorrepository.findById(id).get();
    }

    @Override
    public List<Creator> getAll() {
        return creatorrepository.findAll();
    }
}
