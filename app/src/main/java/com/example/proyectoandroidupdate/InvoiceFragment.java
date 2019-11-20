package com.example.proyectoandroidupdate;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectoandroidupdate.adapter.InvoiceAdapter;
import com.example.proyectoandroidupdate.model.Invoice;


/**
 * A simple {@link Fragment} subclass.
 */
public class InvoiceFragment extends Fragment {


    public InvoiceFragment() {
        // Required empty public constructor
    }

    RecyclerView rvFactura;
    Invoice myInvoices[];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista;
        vista = inflater.inflate(R.layout.fragment_facturas, container, false);

        myInvoices = new Invoice[3];
        rvFactura = vista.findViewById(R.id.rvFactura);
        rvFactura.setLayoutManager(new LinearLayoutManager(getContext()));
        crearArray();
        InvoiceAdapter adapter = new InvoiceAdapter(myInvoices);
        rvFactura.setAdapter(adapter);

        return vista;
    }

    private void crearArray() {
        myInvoices[0] = new Invoice(4, 6.7);
        myInvoices[1] = new Invoice(3, 5);
        myInvoices[2] = new Invoice(7, 12.5);
    }

}
