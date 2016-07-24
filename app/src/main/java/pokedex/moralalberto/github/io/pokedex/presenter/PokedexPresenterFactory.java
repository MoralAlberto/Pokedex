package pokedex.moralalberto.github.io.pokedex.presenter;

import pokedex.moralalberto.github.io.pokedex.data.datasource.PokemonLocalDataSource;
import pokedex.moralalberto.github.io.pokedex.data.repository.PokemonRepository;
import pokedex.moralalberto.github.io.pokedex.domain.model.usecase.GetPokemonListUseCase;

//  Factory conoce la concrección
public class PokedexPresenterFactory {
    public static PokedexPresenter getPresenter(PokedexPresenter.View view) {
        GetPokemonListUseCase useCase = getPokemonListUseCase();
        return new PokedexPresenterImpl(view, useCase);
    }

    private static GetPokemonListUseCase getPokemonListUseCase() {
        PokemonRepository repository = getPokemonRepository();
        GetPokemonListUseCase useCase = new GetPokemonListUseCase(repository);
        return useCase;
    }

    private static PokemonRepository getPokemonRepository() {
        PokemonLocalDataSource dataSource = getPokemonLocalDataSource();
        return new PokemonRepository(dataSource);
    }

    private static PokemonLocalDataSource getPokemonLocalDataSource() {
        return new PokemonLocalDataSource();
    }
}
