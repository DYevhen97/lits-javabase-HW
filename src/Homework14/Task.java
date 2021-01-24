package Homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task {

    private String title;
    private int creationDate;
    private Enum Type;
    private List<String> tags = new ArrayList();

    public Task(String title, int creationDate, Enum type, List<String> tags) {
        this.title = title;
        this.creationDate = creationDate;
        Type = type;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public Enum getType() {
        return Type;
    }

    public void setType(Enum type) {
        Type = type;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
