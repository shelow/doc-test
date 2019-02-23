package fr.slm.doc.avenue.test.domain.values;

public class Post {
    private int id;
    private int userId;
    private String title;
    private String body;

    public Post(int id, int userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }
}
