package agency.vavien.otis;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ${Burhan} on 31.08.2017.
 * burhantoprakman@gmail.com
 */

public class GorevTab1 extends Fragment {
    TextView item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_gorevtab1,container,false);
     //  item1=rootview.findViewById(R.id.item1);
     //  item2=rootview.findViewById(R.id.item2);
     //  item3=rootview.findViewById(R.id.item3);
     //  item4=rootview.findViewById(R.id.item4);
     //  item5=rootview.findViewById(R.id.item5);
     //  item6=rootview.findViewById(R.id.item6);
     //  item7=rootview.findViewById(R.id.item7);
     //  item8=rootview.findViewById(R.id.item8);
     //  item9=rootview.findViewById(R.id.item9);
     //  item10=rootview.findViewById(R.id.item10);
     //  item11=rootview.findViewById(R.id.item11);

     //  item2.setText("Murat Kamçı | Teknisyen");
     //  item10.setText("Sedat Uyar | Teknisyen");
     //  item4.setText("Burhan Yılmaz | Teknisyen");
     //  item5.setText("Olcay Çırak | Teknisyen");
     //  item6.setText("Alper Yayla | Teknisyen");
     //  item7.setText("Gökhan Korkmaz | Teknisyen");
     //  item8.setText("Serkan Bal | Teknisyen");
     //  item9.setText("Oğuzhan Aslan | Teknisyen");
     //  item3.setText("Muhsin Çatı | Teknisyen");
     //  item11.setText("İbrahim Usta | Teknisyen");


        return rootview;
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        // write logic here b'z it is called when fragment is visible to user
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
