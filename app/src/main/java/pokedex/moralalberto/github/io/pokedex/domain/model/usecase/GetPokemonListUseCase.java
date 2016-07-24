package pokedex.moralalberto.github.io.pokedex.domain.model.usecase;

import java.util.List;

import pokedex.moralalberto.github.io.pokedex.data.repository.PokemonRepository;
import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;
import pokedex.moralalberto.github.io.pokedex.presenter.PokedexPresenter;

public class GetPokemonListUseCase {
    private PokemonRepository repository;
    //  Crear clase para cada caso de uso
    //  diferentes casos de uso pueden tener distintas maneras de ejecutarse
    //  Caso de uso + interactor
    public GetPokemonListUseCase(PokemonRepository repository) {
        this.repository = repository;
    }

    public List<Pokemon> execute() {
        return repository.getPokemonList();
    }
}
