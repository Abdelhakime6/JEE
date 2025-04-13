package Inventory.dao.service;

import Inventory.dao.entities.Video;

import java.util.List;

public interface VideoService {
     Video addVideo(Video video);
     Video deleteVideo(Long id);
     Video UpdateVideo(Video video);
     Video getById(Long id);
     List<Video> getAll();

}
