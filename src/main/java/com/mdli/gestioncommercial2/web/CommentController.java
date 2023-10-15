package com.mdli.gestioncommercial2.web;

import com.mdli.gestioncommercial2.model.Comment;
import com.mdli.gestioncommercial2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public Iterable<Comment> getComments(){
        return commentService.getComment();
    }

    @GetMapping("/comments/{id}")
    public Comment getCommment(@PathVariable("id")int id){
        return commentService.getComment(id);
    }

    @PutMapping("comments")
    public Comment updateComments(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/comments/{id}")
    public void deleteComment(@PathVariable("id")int id){
        commentService.deleteComment(id);
    }


@PostMapping("/comments")
    public Comment createComments(@RequestBody Comment comment){
        return commentService.createComment(comment);
}





}
