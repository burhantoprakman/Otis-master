package agency.vavien.otis;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by ${Burhan} on 31.08.2017.
 * burhantoprakman@gmail.com
 */

public class GorevTab3 extends Fragment{
    ImageButton imgbtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_gorevtab3,container,false);

        imgbtn=rootview.findViewById(R.id.yesilimage);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
                builder.setMessage("34430 Arıza Kodlu İnci Plaza Maslak görevi teknisyen Ergi Şener'e atanacaktır.Onaylıyor musunuz?")
                .setCancelable(false)
                 .setPositiveButton("Onayla", new DialogInterface.OnClickListener(){
                     public void onClick(DialogInterface dialog, int id) {
                     }
                     }).setNegativeButton("Vazgeç", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

                 }

        });

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
