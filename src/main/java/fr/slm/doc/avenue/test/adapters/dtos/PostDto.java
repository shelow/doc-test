package fr.slm.doc.avenue.test.adapters.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.slm.doc.avenue.test.domain.values.Post;

public class PostDto extends Post {

    public PostDto() {
        super(0, 0, "", "");
    }

    @JsonCreator
    public PostDto(@JsonProperty("id") int id,@JsonProperty("userId") int userId,
                   @JsonProperty("title") String title,@JsonProperty("body") String body) {
        super(id, userId, title, body);
    }

}
