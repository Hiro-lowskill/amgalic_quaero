package com.example.amgalic;


class User {
    public String  id,name, subject, email, image_id;

    public User() {
    }

    public User(String id, String name, String subject, String email, String image_id) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.image_id = image_id;
    }
}
