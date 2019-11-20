package com.example.proyectoandroidupdate.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoandroidupdate.AddProduct;
import com.example.proyectoandroidupdate.R;
import com.example.proyectoandroidupdate.model.Invoice;

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceAdapter.MyViewHolder>{

    private LayoutInflater inflater;
    //private InvoiceAdapter.OnItemClickListener listener;
    private Invoice myInvoices[];

    /*public interface OnItemClickListener {
        public void onItemClick(Invoice factura);
    }*/

    public InvoiceAdapter(Invoice[] myInvoices /*InvoiceAdapter.OnItemClickListener listener*/) {
        this.myInvoices = myInvoices;
        //this.listener = listener;

    }
    @NonNull
    @Override
    public InvoiceAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_factura, parent, false); //true -> se infla y se añade a la vista; false -> lo hace el RecyclerView
        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final InvoiceAdapter.MyViewHolder holder, int position) {
        final Invoice invoice = myInvoices[position];
        holder.tvNumComandasFact.setText("Número de comandas: " + invoice.getNum_comandas());
        holder.tvPrecioFactura.setText("Precio: " + invoice.getPrecio());
        holder.btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AddProduct.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myInvoices.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNumComandasFact, tvPrecioFactura;
        private Button btAdd, btCancel;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumComandasFact = itemView.findViewById(R.id.tvNumComandasFact);
            tvPrecioFactura = itemView.findViewById(R.id.tvPrecioFactura);
            btAdd = itemView.findViewById(R.id.btAdd);
            btCancel = itemView.findViewById(R.id.btCancel);

        }
    }
}
