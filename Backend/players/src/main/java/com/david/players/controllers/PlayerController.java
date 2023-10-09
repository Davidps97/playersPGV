package com.david.players.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.players.entity.models.Player;
import com.david.players.entity.services.IPlayerService;

@RestController
public class PlayerController {

	@Autowired
	IPlayerService playerService;
	
	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		return playerService.getAll();
	}
	
	@GetMapping("/players/{id}")
	public Player getOne(@PathVariable(value = "id")long id) {
		return playerService.get(id);
	}
	
	@PostMapping("/players")
	public void post(Player player) {
		playerService.post(player);
	}
	
	@PutMapping("/players/{id}")
	public void put(Player player, @PathVariable(value = "id") long id) {
		playerService.put(player, id);
	}
	
	@DeleteMapping("/players/{id}")
	public void delete(@PathVariable(value = "id") long id) {
		playerService.delete(id);
	}
}
