package Inventory;

import Inventory.dao.entities.Creator;
import Inventory.dao.entities.Video;
import Inventory.service.CreatorService;
import Inventory.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private CreatorService creatorService;

    @Autowired
    private VideoService videoService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // CREATE Creator
        Creator creator = new Creator();
        creator.setName("test name");
        creator.setEmail("test@example.com");
        creator = creatorService.addCreator(creator);
        System.out.println("Created Creator: " + creator);

        // CREATE Video
        Video video = new Video();
        video.setName("Spring Boot Tutorial");
        video.setDescription("A complete Spring Boot course.");
        video.setUrl("http://example.com/video1");
        video.setDatepub(new Date());
        video.setCreator(creator);
        video = videoService.addVideo(video);
        System.out.println("Created Video: " + video);

        // READ ALL Creators
        List<Creator> allCreators = creatorService.getAll();
        System.out.println("All Creators:");
        allCreators.forEach(System.out::println);

        // READ Creator by ID
        Creator fetchedCreator = creatorService.getById(creator.getId());
        System.out.println("Fetched Creator by ID: Name = " + fetchedCreator.getName() + ", Email = " + fetchedCreator.getEmail());

        // UPDATE Creator
        fetchedCreator.setName("John Updated");
        Creator updatedCreator = creatorService.UpdateCreator(fetchedCreator);
        System.out.println("Updated Creator by ID: Name = " + updatedCreator.getName() + ", Email = " + updatedCreator.getEmail());

        // READ ALL Videos
        List<Video> allVideos = videoService.getAll();
        System.out.println("All Videos:");
        allVideos.forEach(System.out::println);

        // READ Video by ID
        Video fetchedVideo = videoService.getById(video.getId());
        System.out.println("Fetched video by ID: Name = " + fetchedVideo.getName() + ", desc = " + fetchedVideo.getDescription());

        // UPDATE Video
        fetchedVideo.setDescription("Updated description for the video.");
        Video updatedVideo = videoService.UpdateVideo(fetchedVideo);
        System.out.println("Updated video by ID: Name = " + updatedVideo.getName() + ", desc = " + updatedVideo.getDescription());

        // DELETE Video
        Video deletedVideo = videoService.deleteVideo(updatedVideo.getId());
        System.out.println("deleted video by ID: Name = " + deletedVideo.getName() + ", desc = " + deletedVideo.getDescription());

        // DELETE Creator
        Creator deletedCreator = creatorService.deleteCreator(updatedCreator.getId());
        System.out.println("deleted creator by ID: Name = " + deletedCreator.getName() + ", Email = " + deletedCreator.getEmail());
        Creator creator1 = new Creator();
        creator1.setName("test user");
        creator1.setEmail("user@example.com");
        creator1 = creatorService.addCreator(creator1);

        Video video1 = new Video();
        video1.setName("Spring Boot Tutorial");
        video1.setDescription("A complete Spring Boot  course.");
        video1.setUrl("http://example.com/video2");
        video1.setDatepub(new Date());
        video1.setCreator(creator1);
        video1 = videoService.addVideo(video1);
        System.out.println("Created Video: " + video1);

    }
}
