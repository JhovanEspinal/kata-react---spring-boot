package co.com.sofka.crud;

import java.io.Serializable;

public class TodoDTO implements Serializable {

    private static final Long serialVersionUID = 1L;


    private Long id;
    private String name;
    private boolean completed;
    private String groupListId;


    public TodoDTO() {
    }

    public TodoDTO(Long id, String name,boolean completed, String groupListid){

        this.id= id;
        this.name = name;
        this.completed = completed;
        this.groupListId = groupListid;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(String groupListId) {
        this.groupListId = groupListId;
    }
}


