package hoangduy.code.bai3_tuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvmonan;
    ArrayList<cauthu> mangmonan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvmonan = findViewById(R.id.listviewmonan);
        mangmonan = new ArrayList<cauthu>();
        mangmonan.add(new cauthu("PELE", "October 23, 1940 (age 72)",R.drawable.pele,R.drawable.brazil));
        mangmonan.add(new cauthu("Diego Maradona", "October 30, 1960 (age 52)",R.drawable.maradona,R.drawable.argentina));
        mangmonan.add(new cauthu("Johan Cruyff", "April 25, 1947 (age 65)",R.drawable.cruyff,R.drawable.netherlands));
        mangmonan.add(new cauthu("Franz Beckenbauer", "September 11, 1945 (age 67",R.drawable.beckenbauer,R.drawable.germany));
        mangmonan.add(new cauthu("Michel Platini", "June 21, 1955 (age 57",R.drawable.platini,R.drawable.france));
        mangmonan.add(new cauthu("Ronaldo De Lima", "September 22, 1976 (age 36)",R.drawable.ronaldo,R.drawable.brazil));


        cauthuadapter hihi = new cauthuadapter(
                MainActivity.this,
                R.layout.cauthu_dong,
                mangmonan
        );

        lvmonan.setAdapter(hihi);

    }
}
