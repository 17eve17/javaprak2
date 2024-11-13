package ex4;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void generateNews(String news) {
        System.out.println("Агентство новин генерує новини: " + news);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}


