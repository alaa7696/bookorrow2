package app.book.borrow.bookorrow.service;

import app.book.borrow.bookorrow.dao.PlayGroundDao;
import app.book.borrow.bookorrow.model.PlayGround;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayGroundService {
    public PlayGroundDao playGroundDao;

    @Autowired
    public void setPlayGroundDao(PlayGroundDao playGroundDao) {
        this.playGroundDao = playGroundDao;
    }

    public List<PlayGround> getAllPlayGrounds(){
        return playGroundDao.findAll();
    }
    public PlayGround getPlayGroundByName(final String name){
        return playGroundDao.findByName(name);
    }
}
