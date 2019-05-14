package app.book.borrow.bookorrow.controller;

import app.book.borrow.bookorrow.model.PlayGround;
import app.book.borrow.bookorrow.service.PlayGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayGroundController {
    public PlayGroundService playGroundService;

    @Autowired
    public void setPlayGroundService(PlayGroundService playGroundService) {
        this.playGroundService = playGroundService;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/getAll")
    public List<PlayGround> getAllPlayGround(){
        return playGroundService.getAllPlayGrounds();
    }
}
