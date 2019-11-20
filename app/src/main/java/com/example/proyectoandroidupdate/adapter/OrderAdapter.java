package com.example.proyectoandroidupdate.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoandroidupdate.R;
import com.example.proyectoandroidupdate.model.Order;


public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder>{

    private LayoutInflater inflater;
    //private OrderAdapter.OnItemClickListener listener;
    private Order myOrders[];

    /*public interface OnItemClickListener {
        public void onItemClick(Order comanda);
    }*/

    public OrderAdapter(Order[] myOrders /*OrderAdapter.OnItemClickListener listener*/) {
        this.myOrders = myOrders;
        //this.listener = listener;

    }

    @NonNull
    @Override
    public OrderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_comanda, parent, false); //true -> se infla y se añade a la vista; false -> lo hace el RecyclerView
        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.MyViewHolder holder, int position) {
        final Order order = myOrders[position];
        holder.tvNombreCom.setText("Unidades: " + order.getNum_unidades());
        holder.tvPrecioCom.setText("Precio: " + (order.getPrecio()));
        holder.ivComanda.setImageResource(R.drawable.ic_add_black_24dp);
    }

    @Override
    public int getItemCount() {
        return myOrders.length;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivComanda;
        private TextView tvNombreCom, tvPrecioCom;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivComanda = itemView.findViewById(R.id.ivComanda);
            tvNombreCom = itemView.findViewById(R.id.tvNombreCom);
            tvPrecioCom = itemView.findViewById(R.id.tvPrecioCom);
        }
    }
}
