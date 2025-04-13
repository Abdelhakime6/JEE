package Inventory.service;

import Inventory.dao.entities.Creator;

import java.util.List;

public interface CreatorService {
    Creator addCreator(Creator creator);
    Creator deleteCreator(Long id);
    Creator UpdateCreator(Creator creator);
    Creator getById(Long id);
    List<Creator> getAll();
}
