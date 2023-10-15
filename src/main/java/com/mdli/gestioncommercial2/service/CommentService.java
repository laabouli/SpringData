package com.mdli.gestioncommercial2.service;

import com.mdli.gestioncommercial2.model.Comment;
import com.mdli.gestioncommercial2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Iterable<Comment> getComment(){
        return commentRepository.findAll();
    }

    public void deleteComment(int id){
        commentRepository.deleteById(id);
    }

    public Comment updateComment(Comment comment){
        return commentRepository.save(comment);
    }

    public Comment createComment(Comment comment){
        return commentRepository.save(comment);
    }

    public Comment getComment(int id){
        return commentRepository.findById(id).get();
    }

}
