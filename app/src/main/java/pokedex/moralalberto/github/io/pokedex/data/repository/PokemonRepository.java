package pokedex.moralalberto.github.io.pokedex.data.repository;

import java.util.List;

import pokedex.moralalberto.github.io.pokedex.data.PokemonData;
import pokedex.moralalberto.github.io.pokedex.data.PokemonDataMapper;
import pokedex.moralalberto.github.io.pokedex.data.datasource.PokemonLocalDataSource;
import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;

public class PokemonRepository {
    private final PokemonLocalDataSource localDataSource;

    public PokemonRepository(PokemonLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    public List<Pokemon> getPokemonList() {
        List<PokemonData> pokemons = localDataSource.getPokemonList();
        List<Pokemon> result = PokemonDataMapper.map(pokemons);
        return result;
    }
}
