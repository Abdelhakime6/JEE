package Inventory.service;

import Inventory.dao.entities.Video;
import Inventory.dao.repositories.videosrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoManager implements VideoService{

    @Autowired
    private videosrepository vidrepo;

    @Override
    public Video addVideo(Video video) {
        List<Video> vids = vidrepo.findByName(video.getName());
        if (!vids.isEmpty()){
            System.out.println("video already exist");
            return null;
        }
        else{
            return vidrepo.save(video);
        }
    }

    @Override
    public Video deleteVideo(Long id) {
        Video video = vidrepo.findById(id).get();
        if(video != null){
            vidrepo.deleteById(id);
            return video;
        }
        else{
        return null;
        }
    }

    @Override
    public Video UpdateVideo(Video video) {
        return vidrepo.save(video);
    }

    @Override
    public Video getById(Long id) {
        return vidrepo.findById(id).get();
    }

    @Override
    public List<Video> getAll() {
        return vidrepo.findAll();
    }
}
