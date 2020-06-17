package com.example.projectku;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectku.materi.MateriAdapter;
import com.example.projectku.materi.MateriModel;

import java.util.ArrayList;
import java.util.List;

public class MateriActivity extends AppCompatActivity implements MateriAdapter.OnMateriClickListener {

    public RecyclerView rv;
    public MateriAdapter materiAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<MateriModel> listMateriModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        rv = findViewById(R.id.rvMateri);

        listMateriModel.add(new MateriModel("Materi 1",
                "Pengajar 1",
                "http://e-lesson.mif-project.com/assets/images/loogo-materi-pdf.png"));

        listMateriModel.add(new MateriModel("Materi 2",
                "Pengajar 2",
                "http://e-lesson.mif-project.com/assets/images/loogo-materi-pdf.png"));
        listMateriModel.add(new MateriModel("Materi 3",
                "Pengajar 3",
                "http://e-lesson.mif-project.com/assets/images/loogo-materi-pdf.png"));
        materiAdapter = new MateriAdapter(listMateriModel);
        materiAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(materiAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position) {
        MateriModel materiModel = listMateriModel.get(position);
        Toast.makeText(this, materiModel.getNamamateri(),
                Toast.LENGTH_LONG).show();
    }

}
