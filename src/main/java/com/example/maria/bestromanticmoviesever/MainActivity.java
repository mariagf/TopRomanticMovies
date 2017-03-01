package com.example.maria.bestromanticmoviesever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String ListItemsStaring[] = new String[]{ "Mandy Moore & Shane West", "Channing Tatum & Amanda Seyfried", "Alex Pettyfer & Garbriella Wilde", "Chloë Grace Moretz & Jamie Blackley", "Jennifer Love Hewitt & Paul Nicholls", "Emilia Clarke & Sam Claflin", "Brad Pitt & Claire Forlani", "Dakota Fanning & Jeremy Irvine", "Robert Pattinson & Emilie de Ravin", "Hailee Steinfeld & Douglas Booth", "Clint Eastwood & Meryl Streep", "Ansel Elgort & Shailene Woodley", "Zac Efron & Taylor Schilling", "Ryan Gosling & Rachel McAdams"};
    String ListItemsYear[] = new String[]{ "2002", "2010", "2014", "2014", "2004", "2016", "1998", "2012", "2010", "2013", "1995", "2014", "2012", "2004"};
    String ListItemsName[] = new String[]{ "A walk to remember", "Dear John", "Endless love", "If I stay", "If only", "Me before you", "Meet Joe Black", "Now is good", "Remember me", "Romeo and Juliet", "The bridges of Madison County", "The fault in our stars", "The lucky one", "The notebook"};
    Integer ImageName[] = { R.drawable.awalktoremember, R.drawable.dearjohn, R.drawable.endlesslove, R.drawable.ifistay, R.drawable.ifonly, R.drawable.mebeforeyou, R.drawable.meetjoeblack, R.drawable.nowisgood, R.drawable.rememberme, R.drawable.romeoandjuliet, R.drawable.thebridgesofmadisoncounty, R.drawable.thefaultinourstars, R.drawable.theluckyone, R.drawable.thenotebook};

    ListView listView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.movieslist);
        listAdapter = new com.example.maria.bestromanticmoviesever.CustomListAdapter(MainActivity.this, ListItemsName, ImageName, ListItemsYear, ListItemsStaring);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), ListItemsName[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}