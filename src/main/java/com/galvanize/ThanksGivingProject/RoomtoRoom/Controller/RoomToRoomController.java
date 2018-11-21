package com.galvanize.ThanksGivingProject.RoomtoRoom.Controller;

import com.galvanize.ThanksGivingProject.RoomtoRoom.Model.RoomToRoom;
import com.galvanize.ThanksGivingProject.RoomtoRoom.Service.RoomToRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/move")
public class RoomToRoomController {

    private final RoomToRoomService roomToRoomService;
    private final Logger sl4jLogger = LoggerFactory.getLogger(RoomToRoomController.class);

    public RoomToRoomController(RoomToRoomService service){

        roomToRoomService = service;
    }

    //Attempting to go to new room
    @PostMapping("/{characterId}/to/{roomId}")
    public RoomToRoom roomService(@PathVariable Long characterId, @PathVariable Long roomId){

        return null;
    }


}
