package com.project.gamelist.services;

import com.project.gamelist.entities.Game;
import com.project.gamelist.dto.GameMinDTO;
import org.springframework.stereotype.Service;
import com.project.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
