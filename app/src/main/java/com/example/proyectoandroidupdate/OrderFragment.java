package com.example.proyectoandroidupdate;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectoandroidupdate.adapter.OrderAdapter;
import com.example.proyectoandroidupdate.model.Order;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {


    public OrderFragment() {
        // Required empty public constructor
    }

    RecyclerView rvComanda;
    Order myOrders[];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista;
        vista = inflater.inflate(R.layout.fragment_comandas, container, false);

        myOrders = new Order[3];
        rvComanda = vista.findViewById(R.id.rvComanda);
        rvComanda.setLayoutManager(new LinearLayoutManager(getContext()));
        crearArray();
        OrderAdapter adapter = new OrderAdapter(myOrders);
        rvComanda.setAdapter(adapter);

        return vista;
    }

    private void crearArray() {
        myOrders[0] = new Order(3, 6, true);
        myOrders[1] = new Order(8, 7.9, false);
    }

}
