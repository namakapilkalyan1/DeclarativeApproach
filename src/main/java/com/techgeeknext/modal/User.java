package com.techgeeknext.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    @JsonIgnore
    private Long userId;

    @NotNull
    @Email
    @Size(max = 100)
    @Pattern(regexp=".+@.+\\..+", message="Wrong email!")
    @Column(name = "user_mail", unique = true)
    @JsonProperty("Mail Id")
    private String userMail;

    @NotNull
    @Size(min=8, message="Password should have atleast 8 characters")
    @Column(name = "user_pass")
    @JsonProperty("Password")
    private String userPass;

    public User() {
    }

    public User(Long userId, String userPass) {
        this.userId = userId;
        this.userMail = userMail;
        this.userPass = userPass;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
