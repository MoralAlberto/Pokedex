package pokedex.moralalberto.github.io.pokedex.presenter;

import java.util.List;

import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;

public interface PokedexPresenter {

    void onRequestPokemonList();

    //  Esto es un protocolo, aquí definimos
    //  Vista para poder usarme a mi debes cumplir este contrato
    interface View {
        void renderPokemons(List<Pokemon> pokemons);
    }
}
