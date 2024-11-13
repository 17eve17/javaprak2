package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library<T extends Media> {
    private List<T> mediaList;

    public Library() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaList.add(media);
        System.out.println("Added: " + media.getTitle());
    }

    public void removeMedia(T media) {
        if (mediaList.remove(media)) {
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Media not found.");
        }
    }

    public List<T> searchByTitle(String title) {
        return mediaList.stream()
                .filter(media -> media.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void displayAll() {
        if (mediaList.isEmpty()) {
            System.out.println("No media in library.");
        } else {
            mediaList.forEach(T::displayInfo);
        }
    }
}

