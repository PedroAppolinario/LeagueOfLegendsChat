package chat.leagueoflegends.loliachat.application;

import chat.leagueoflegends.loliachat.domain.model.Champions;
import chat.leagueoflegends.loliachat.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champions> findAll() {
        return repository.findAll();
    }

}
