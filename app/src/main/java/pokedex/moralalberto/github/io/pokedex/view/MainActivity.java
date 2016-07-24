package pokedex.moralalberto.github.io.pokedex.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import pokedex.moralalberto.github.io.pokedex.R;
import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;
import pokedex.moralalberto.github.io.pokedex.presenter.PokedexPresenter;
import pokedex.moralalberto.github.io.pokedex.presenter.PokedexPresenterFactory;
import pokedex.moralalberto.github.io.pokedex.view.adapter.PokemonListAdapter;

//  Implements = contrato de PokedexPresenter.View
public class MainActivity extends AppCompatActivity
                            implements PokedexPresenter.View {
    private ListView listView;
    private PokedexPresenter pokedexPresenter;
    private PokemonListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeList();
        initializePresenter();
    }

    private void initializePresenter() {
        pokedexPresenter = PokedexPresenterFactory.getPresenter(this);
        pokedexPresenter.onRequestPokemonList();
    }

    private void initializeList() {
        adapter = new PokemonListAdapter(this);
        //  List bindeada al activity
        listView = (ListView) findViewById(R.id.list);
        //  a la vista le tenemos que inyectar el presenter
        listView.setAdapter(adapter);
    }

    @Override
    public void renderPokemons(List<Pokemon> pokemons) {
        adapter.clear();
        adapter.addAll(pokemons);
        adapter.notifyDataSetChanged();
    }
}
