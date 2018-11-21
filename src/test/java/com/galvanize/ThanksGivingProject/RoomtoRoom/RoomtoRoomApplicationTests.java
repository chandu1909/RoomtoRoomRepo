package com.galvanize.ThanksGivingProject.RoomtoRoom;

import com.galvanize.ThanksGivingProject.RoomtoRoom.Controller.RoomToRoomController;
import com.galvanize.ThanksGivingProject.RoomtoRoom.Model.RoomToRoom;
import com.galvanize.ThanksGivingProject.RoomtoRoom.Service.RoomToRoomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomtoRoomApplicationTests {

	@Mock
	private RoomToRoomService mockService;


	@Test
	public void contextLoads() {
	}

	//checking roomservice
	@Test
	public void testRoomService(){
		assertTrue(true);

		//SetUp
        Long characterId = 3L;
        Long roomId = 2l;

        RoomToRoomService expectedResult = new RoomToRoomService();
        RoomToRoomController roomToRoomController = new RoomToRoomController(mockService);
        when(mockService.roomService(characterId,roomId)).thenReturn(expectedResult);

        //Execute
        RoomToRoom actualResult = roomToRoomController.roomService(characterId,roomId);

		//Assert
        assertEquals(expectedResult,actualResult);

		//Teardown
	}

}
