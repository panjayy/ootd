package com.example.panjibs.ootd;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartsFragments extends Fragment {
    private List<Integer> mImageIds;
    private Integer mListIndex;
    private static String TAG = "BodyPartsFragment";
    //penyimpanan session sebelum/sesudah diputar
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    public BodyPartsFragments() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

        //inflate fragment layout
        View rootView = inflater.inflate(R.layout.body_part_layout_fragment, container, false);

        //mengambil id image view pada layout
        final ImageView iv = (ImageView) rootView.findViewById(R.id.imageView_body_part_layout_fragment);

        //menampilkan gambar res ke imageview
        iv.setImageResource(mImageIds.get(mListIndex));

        //mengganti gambar saat klik
        iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //kondisi mengubah id image
                if (mListIndex < mImageIds.size()-1) {
                    mListIndex++;
                }
                //memanggil array
                else {
                    mListIndex = 0;
                }
                iv.setImageResource(mImageIds.get(mListIndex));
            }
        });

        return rootView;
    }
    //menyimpan variabel array & index
    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX, mListIndex);
    }
    //memanggil list image assets
    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }
    //memanggil list dimulai dari image berapa
    public void setmListIndex(Integer mListIndex) {
        this.mListIndex = mListIndex;
    }
}
