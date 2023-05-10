package com.eluanps.dslist.services;

import com.eluanps.dslist.entities.Game;
import com.eluanps.dslist.entities.dto.GameMinDTO;
import com.eluanps.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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