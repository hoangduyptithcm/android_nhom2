package hoangduy.code.monan_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvmonan;
    ArrayList<monan> mangmonan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvmonan = findViewById(R.id.listviewmonan);
        mangmonan = new ArrayList<monan>();
        mangmonan.add(new monan("VIETNAM", "Population:98000000", R.drawable.vn));
        mangmonan.add(new monan("United States", "Population:98000000", R.drawable.us));
        mangmonan.add(new monan("Russia", "Population:142000000", R.drawable.ru));


        monanadapter hihi = new monanadapter(
          MainActivity.this,
          R.layout.dong_mon_an,
          mangmonan
        );

        lvmonan.setAdapter(hihi);
    }
}
