package fr.slm.doc.avenue.test.domain.values;

import java.util.Objects;

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

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getTitle() { return title; }
    public String getBody() { return body; }

    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;
        Post post = (Post) o;
        return id == post.id &&
                userId == post.userId &&
                title.equals(post.title) &&
                Objects.equals(body, post.body);
    }

    public int hashCode() {
        return Objects.hash(id, userId, title, body);
    }
}
