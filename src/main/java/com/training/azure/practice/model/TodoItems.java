package com.training.azure.practice.model;

public class TodoItems {

    private String entityType;

    private String name;

    private String category;

    private Boolean complete;

    private String id;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TodoItems(String entityType, String name, String category, Boolean complete, String id) {
        this.entityType = entityType;
        this.name = name;
        this.category = category;
        this.complete = complete;
        this.id = id;
    }

    protected TodoItems() {
    }
}
