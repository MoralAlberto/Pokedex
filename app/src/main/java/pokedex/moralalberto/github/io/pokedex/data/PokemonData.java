package pokedex.moralalberto.github.io.pokedex.data;


public class PokemonData {

    private long id;
    private String imageUrl;
    private String name;
    private String description;
    private PokemonData() { }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Dentro de cada clase POJO tenemos un builder para settear las propiedades
    public static class Builder {
        private final PokemonData pokemonData = new PokemonData();

        public Builder setId(long id) {
            pokemonData.id = id;
            return this;
        }

        public Builder setName(String name) {
            pokemonData.name = name;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            pokemonData.imageUrl = imageUrl;
            return this;
        }

        public Builder setDescription(String description) {
            pokemonData.description = description;
            return this;
        }

        public PokemonData build() {
            return pokemonData;
        }
    }
}
