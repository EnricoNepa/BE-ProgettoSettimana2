package Blog;

import java.util.Arrays;

public class Tags {

    //ATTRIBUTI
    private String[] tags;


    //COSTRUTTORE
    public Tags(String[] tags) {
        this.tags = tags;
    }

    //GETTER & SETTER
    public String[] getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Tags: "+ Arrays.toString(tags);
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
