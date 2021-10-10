package c0321g1_gaming.controller.game;

import c0321g1_gaming.dto.game.GameDto;
import c0321g1_gaming.model.entity.game.Game;
import c0321g1_gaming.model.service.game.IGameService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("game/api")
public class GameRestController {
    @Autowired
    private IGameService gameService;

    //        Creator: Pháp
    @GetMapping
    public ResponseEntity<Page<Game>> getListGame(@PageableDefault(size = 8) Pageable pageable) {
        Page<Game> gameList = gameService.getAllGame(pageable);
        if (gameList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(gameList, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<Game>> searchGame(@PageableDefault(size = 8) Pageable pageable,
                                                 @RequestParam String name, @RequestParam String gameType) {
        Page<Game> gameList = gameService.getGameBySearching(pageable, name, gameType);
        if (gameList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(gameList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<Game> gameOptional = gameService.findById(id);
        if (!gameOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(gameOptional.get(), HttpStatus.OK);
        }
    }

    @GetMapping("/top")
    public ResponseEntity<List<Game>> getTopGame() {
        List<Game> gameList = gameService.searchTopGame();
        if (gameList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(gameList, HttpStatus.OK);
    }

    @PatchMapping(value = "delete/{id}")
    public ResponseEntity<Game> deleteGame(@PathVariable Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<Game> gameOptional = gameService.findById(id);
        if (!gameOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            if(gameOptional.get().getFlagDelete() == 1) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            gameService.deleteGameFlag(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}