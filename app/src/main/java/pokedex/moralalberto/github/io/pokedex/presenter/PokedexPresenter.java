package pokedex.moralalberto.github.io.pokedex.presenter;

/**
 * Created by Moral on 23/7/16.
 */
public interface PokedexPresenter {
    //Esto es un protocolo, aquí definimos
    //  Vista para poder usarme a mi debes cumplir este contrato
    interface View {
        void renderPokemons() {

        }
    }
}
