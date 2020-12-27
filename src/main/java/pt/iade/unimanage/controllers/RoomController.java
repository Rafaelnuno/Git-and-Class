package pt.iade.unimanage.controllers;

import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.unimanage.models.Room;



@RestController
@RequestMapping(path = "/api/rooms")
public class RoomController {
    private Logger logger = LoggerFactory.getLogger(StudentController.class);

    // get all rooms
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Room> getRooms() {
        logger.info("Sending all rooms");
    
    }