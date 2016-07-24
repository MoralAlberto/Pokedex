package pokedex.moralalberto.github.io.pokedex.presenter;

import java.util.List;

import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;
import pokedex.moralalberto.github.io.pokedex.domain.model.usecase.GetPokemonListUseCase;


//  Genera la implementación del presenter
public class PokedexPresenterImpl implements PokedexPresenter {
    private final View view;
    private  final GetPokemonListUseCase getPokemonListUseCase;

    public PokedexPresenterImpl(View view, GetPokemonListUseCase getPokemonListUseCase) {
        this.view = view;
        this.getPokemonListUseCase = getPokemonListUseCase;
    }

    @Override
    public void onRequestPokemonList() {
        List<Pokemon> pokemonList = getPokemonListUseCase.execute();
        view.renderPokemons(pokemonList);
    }
}
