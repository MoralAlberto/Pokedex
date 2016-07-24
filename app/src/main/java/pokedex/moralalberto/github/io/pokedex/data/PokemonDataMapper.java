package pokedex.moralalberto.github.io.pokedex.data;

import java.util.ArrayList;
import java.util.List;

import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;

/**
 * Created by Moral on 23/7/16.
 */
public class PokemonDataMapper {

    public static List<Pokemon> map(List<PokemonData> source) {
        List<Pokemon> result = new ArrayList<>(source.size());
        for (PokemonData pokemonData : source) {
            Pokemon pokemon = map(pokemonData);
            result.add(pokemon);
        }
        return result;
    }


    public static Pokemon map(PokemonData source) {
        return new Pokemon.Builder()
                .setId(source.getId())
                .setName(source.getName())
                .setDescription(source.getDescription())
                .setImageUrl(source.getImageUrl())
                .build();
    }
}
