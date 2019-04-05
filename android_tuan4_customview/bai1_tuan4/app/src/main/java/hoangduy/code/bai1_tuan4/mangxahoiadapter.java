package hoangduy.code.bai1_tuan4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class mangxahoiadapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    List<mangxahoi> arrmonan;


    public mangxahoiadapter(Context context, int layout, List<mangxahoi> mangmonan) {
        myContext = context;
        myLayout = layout;
        arrmonan = mangmonan;

    }

    @Override
    public int getCount() {
        return arrmonan.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    class monanne {
        ImageView hinh;
        TextView chu1;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // dòng này để lấy file dong_sinh_vien.xml
//        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater = ((Activity) myContext).getLayoutInflater();
        // lấy trong dong_sinhvien.xml bằng converview
        monanne mon;

        if (convertView == null) {
            convertView = inflater.inflate(myLayout, null);
            // ảnh xạ và gán giá trị
            mon = new monanne();
            mon.hinh = convertView.findViewById(R.id.imageview);
            mon.chu1 = convertView.findViewById(R.id.textView1);


            convertView.setTag(mon);

        } else {
            mon = (monanne) convertView.getTag();
        }
        mon.hinh.setImageResource(arrmonan.get(position).getAnh());
        mon.chu1.setText(arrmonan.get(position).getTen());
        return convertView;
    }
}
