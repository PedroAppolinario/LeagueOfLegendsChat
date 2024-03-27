package chat.leagueoflegends.loliachat.domain.ports;

import chat.leagueoflegends.loliachat.domain.model.Champions;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface ChampionsRepository {
    List<Champions> findAll();

    Optional<Champions> findById (Long Id);
}
