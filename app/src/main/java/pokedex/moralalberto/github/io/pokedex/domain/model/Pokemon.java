package pokedex.moralalberto.github.io.pokedex.domain.model;


public class Pokemon {

    private long id;
    private String imageUrl;
    private String name;
    private String description;
    private Pokemon() { }

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
        private final Pokemon pokemon = new Pokemon();

        public Builder setId(long id) {
            pokemon.id = id;
            return this;
        }

        public Builder setName(String name) {
            pokemon.name = name;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            pokemon.imageUrl = imageUrl;
            return this;
        }

        public Builder setDescription(String description) {
            pokemon.description = description;
            return this;
        }

        public Pokemon build() {
            return pokemon;
        }
    }
}
