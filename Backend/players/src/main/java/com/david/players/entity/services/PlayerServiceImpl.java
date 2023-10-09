package com.david.players.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.players.entity.dao.IPlayerDao;
import com.david.players.entity.models.Player;

@Service
public class PlayerServiceImpl implements IPlayerService{
	
	@Autowired
	private IPlayerDao playerDao;
	
	@Override
	public Player get(long id) {
		return playerDao.findById(id).get();
	}
	
	@Override
	public List<Player> getAll() {
		return (List<Player>)playerDao.findAll();
	}
	
	@Override
	public void post(Player player) {
		playerDao.save(player);
	}
	
	@Override
	public void put(Player player, long id) {
		playerDao.findById(id).ifPresent((x)->{
			player.setId(id);
			playerDao.save(player);
		});
	}
	
	@Override
	public void delete(long id) {
		playerDao.deleteById(id);
	}
}
