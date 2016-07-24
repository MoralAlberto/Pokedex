package pokedex.moralalberto.github.io.pokedex.data.datasource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import pokedex.moralalberto.github.io.pokedex.data.PokemonData;

public class PokemonLocalDataSource {
    private Map<Long, PokemonData> cache = new LinkedHashMap<>();

    public PokemonLocalDataSource() {
        for (int counter = 1; counter<= 100; counter++) {
            buildFakePokemon(counter, String.format(Locale.getDefault(), "Pokemon %d", counter),
                    String.format(Locale.getDefault(), "Pokemon Description %d", counter), "http://lorempixel.com/150/150/nature/");
        }
    }


    private void buildFakePokemon(long id, String name, String description, String imageUrl) {
        PokemonData pokemon =  new PokemonData.Builder()
                .setId(id)
                .setName(name)
                .setDescription(description)
                .setImageUrl(imageUrl)
                .build();
        cache.put(pokemon.getId(), pokemon);
    }
    public List<PokemonData> getPokemonList() {
        return new ArrayList<>(cache.values());
    }
}
