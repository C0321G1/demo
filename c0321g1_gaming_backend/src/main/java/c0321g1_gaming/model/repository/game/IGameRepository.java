package c0321g1_gaming.model.repository.game;

import c0321g1_gaming.model.entity.game.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface IGameRepository extends JpaRepository<Game, Long> {
    //    Creator: Thúy

    @Query(value = "SELECT game_id,`name`,content,image,gaming,trailer,game_type_id,flag_delete FROM game WHERE game_id = ?;", nativeQuery = true)
    Optional<Game> findById(Long gameId);

    @Query(value = "SELECT * FROM game WHERE flag_delete = 0", nativeQuery = true)
    Page<Game> getAllGame(Pageable pageable);

    @Query(value = "SELECT * FROM game " +
            "join game_type on game.game_type_id = game_type.game_type_id " +
            "WHERE ( game.`name` like ?1 ) and (game_type.`name` like ?2 ) and game.flag_delete = 0", nativeQuery = true)
    Page<Game> getGameBySearching(Pageable pageable, String name, String gameType);

    @Transactional
    @Modifying
    @Query(value = "UPDATE game SET flag_delete = 1  WHERE game_id = ?1 ", nativeQuery = true)
    void deleteGameFlag(Long gameId);

    @Query(value = "SELECT * FROM game WHERE flag_delete = 0 order by gaming desc limit 3", nativeQuery = true)
    List<Game> searchTopGame();
}
