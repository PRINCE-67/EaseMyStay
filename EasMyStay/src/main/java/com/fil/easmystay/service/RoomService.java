package com.fil.easmystay.service;

import java.util.List;

import com.fil.easmystay.models.Room;


public interface RoomService {

	public Room createRoom(Room room);

	public List<Room> getRooms();

	public Room getRoomById(long id);

	public Room updateRoom(Room room);

	public String deleteRoomById(long id);

}
