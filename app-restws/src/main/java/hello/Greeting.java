package hello;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Greeting {

    private long id;
    private String content;

    public Greeting() {
        id = 1;
        content = "Hello Default";
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
