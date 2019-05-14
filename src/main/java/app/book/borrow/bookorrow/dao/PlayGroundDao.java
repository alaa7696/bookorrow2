package app.book.borrow.bookorrow.dao;

import app.book.borrow.bookorrow.model.PlayGround;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayGroundDao extends JpaRepository<PlayGround,Long> {
    PlayGround findByName(String name);
}
