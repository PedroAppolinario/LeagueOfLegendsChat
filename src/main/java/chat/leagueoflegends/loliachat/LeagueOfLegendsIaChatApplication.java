package chat.leagueoflegends.loliachat;

import chat.leagueoflegends.loliachat.application.ListChampionsUseCase;
import chat.leagueoflegends.loliachat.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LeagueOfLegendsIaChatApplication {

	public static void main(String[] args) { SpringApplication.run(LeagueOfLegendsIaChatApplication.class, args); }
	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository){
		return new ListChampionsUseCase(repository);
	}

}
