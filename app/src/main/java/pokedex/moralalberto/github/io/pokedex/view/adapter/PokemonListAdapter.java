package pokedex.moralalberto.github.io.pokedex.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import pokedex.moralalberto.github.io.pokedex.R;
import pokedex.moralalberto.github.io.pokedex.domain.model.Pokemon;



public class PokemonListAdapter extends ArrayAdapter<Pokemon> {
    public PokemonListAdapter(Context context) {
        super(context, R.layout.item_pokemon);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View result = convertView;

        if (result == null) {
            result = LayoutInflater.from(getContext()).inflate(R.layout.item_pokemon, parent, false);
        }

        Pokemon pokemon = getItem(position);
        renderAvatar(pokemon, result);
        renderDescription(pokemon, result);
        renderName(pokemon, result);

        return result;
    }

    private void renderName(Pokemon pokemon, View view) {
        TextView nameView = (TextView) view.findViewById(R.id.name);
        nameView.setText(pokemon.getName());
    }

    private void renderDescription(Pokemon pokemon, View view) {
        TextView descriptionView = (TextView) view.findViewById(R.id.description);
        descriptionView.setText(pokemon.getDescription());

    }

    private void renderAvatar(Pokemon pokemon, View view) {
        ImageView avatarImage = (ImageView) view.findViewById(R.id.avatar);
        Picasso.with(getContext())
                .load(pokemon.getImageUrl())
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .into(avatarImage);
    }
}
