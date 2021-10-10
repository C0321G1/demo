package c0321g1_gaming.model.service.game;

import c0321g1_gaming.model.entity.game.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGameService {

    //    Creator: Pháp

    Optional<Game> findById(Long gameId);

    Page<Game> getAllGame(Pageable pageable);

    Page<Game> getGameBySearching(Pageable pageable, String name, String gameType);

    void deleteGameFlag(Long gameId);

    List<Game> searchTopGame();
}
