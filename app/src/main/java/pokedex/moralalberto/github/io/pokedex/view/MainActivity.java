package pokedex.moralalberto.github.io.pokedex.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import pokedex.moralalberto.github.io.pokedex.R;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeList();
    }

    private void initializeList() {
        //  List bindeada al activity
        listView = (ListView) findViewById(R.id.list);
    }
}
