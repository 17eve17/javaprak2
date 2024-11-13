package ex4;

public class UserSubscriber implements Subscriber {
    private String name;

    public UserSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " отримав новини: " + news);
    }
}


