package com.techgeeknext.repository;

import com.techgeeknext.modal.Notes;
import com.techgeeknext.modal.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NotesRepository extends CrudRepository<Notes, Long>{
}