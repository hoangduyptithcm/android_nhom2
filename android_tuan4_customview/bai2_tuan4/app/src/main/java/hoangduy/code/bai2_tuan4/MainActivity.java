package hoangduy.code.bai2_tuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvmonan;
    ArrayList<traicay> mangmonan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvmonan = findViewById(R.id.listviewmonan);
        mangmonan = new ArrayList<traicay>();
        mangmonan.add(new traicay("Strawberry", "It is an aggregate accessory fruit", R.drawable.dau));
        mangmonan.add(new traicay("Banana", "It is the largest herbaceous flowering plant", R.drawable.chuoi));
        mangmonan.add(new traicay("Orange", "Citrus Fruit", R.drawable.cam));
        mangmonan.add(new traicay("Mixed", "Mixed Fruits", R.drawable.tonghop));


        traicayadapter hihi = new traicayadapter (
                MainActivity.this,
                R.layout.traicay_dong,
                mangmonan
        );

        lvmonan.setAdapter(hihi);


    }
}
