package com.example.proyectoandroidupdate.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoandroidupdate.R;
import com.example.proyectoandroidupdate.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ProductAdapter.OnItemClickListener listener;
    private Product myProducts[];

    public interface OnItemClickListener {
        public void onItemClick(Product product);
    }

    public ProductAdapter(Product[] myProducts, ProductAdapter.OnItemClickListener listener) {
        this.myProducts = myProducts;
        this.listener = listener;

    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_producto, parent, false); //true -> se infla y se añade a la vista; false -> lo hace el RecyclerView
        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position) {
        final Product product = myProducts[position];
        holder.ivProduct.setImageResource(R.drawable.ic_launcher_background);
        holder.tvNameProd.setText("Nombre: " + product.getNombre());
        holder.tvPriceProd.setText("Precio: " + product.getPrecio());
    }

    @Override
    public int getItemCount() {
        return myProducts.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivProduct;
        private TextView tvNameProd, tvPriceProd;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProduct = itemView.findViewById(R.id.ivProduct);
            tvNameProd =  itemView.findViewById(R.id.tvNameProd);
            tvPriceProd =  itemView.findViewById(R.id.tvPriceProd);
        }

    }
}
