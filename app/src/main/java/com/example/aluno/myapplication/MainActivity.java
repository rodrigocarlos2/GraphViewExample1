package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                // VanVan, it is here that data stays.
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 8),
                new DataPoint(3, 4),
                new DataPoint(3, 4),
                new DataPoint(4, 4),
                new DataPoint(5, 7),
                new DataPoint(7, 4),
                new DataPoint(8, 3),
                new DataPoint(9, 8)
        });
        graph.addSeries(series);
    }
}
