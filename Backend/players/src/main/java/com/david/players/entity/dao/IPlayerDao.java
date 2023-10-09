package com.david.players.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.david.players.entity.models.Player;

public interface IPlayerDao extends CrudRepository<Player, Long>{

}
