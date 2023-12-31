package com.mdli.gestioncommercial2.repository;

import com.mdli.gestioncommercial2.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
