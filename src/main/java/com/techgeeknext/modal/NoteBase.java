package com.techgeeknext.modal;

import com.techgeeknext.util.ApplicationConstants;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@MappedSuperclass
public class NoteBase {

    @NotEmpty(message = ApplicationConstants.VALIDATION_TITLE_EMPTY)
    @NotBlank(message = ApplicationConstants.VALIDATION_TITLE_EMPTY)
    @Size(max = 50)
    private String title;

    @Size(max = 1000)
    private String message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
