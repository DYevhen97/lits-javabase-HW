package Homework14;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private String title;
    String creationDate;
    Enum type;
    private List<String> tags = new ArrayList();

    public Task(String title, String creationDate, Enum type) {
        this.title = title;
        this.creationDate = creationDate;
        this.type = type;
    }

    public Task(String title, String creationDate, Enum type, List<String> tags) {
        this.title = title;
        this.creationDate = creationDate;
        type = type;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
