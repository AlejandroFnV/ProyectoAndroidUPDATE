package com.example.proyectoandroidupdate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.proyectoandroidupdate.adapter.ProductAdapter;
import com.example.proyectoandroidupdate.model.Product;

public class AddProduct extends AppCompatActivity {

    private RecyclerView myRecycler;
    private RecyclerView.LayoutManager layoutManager;
    private Product myProducts[] = new Product[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_producto);

        init();

    }

    private void init() {
        myRecycler = findViewById(R.id.rvProduct);

        //asignarle un layout manager
        //layoutManager = new LinearLayoutManager(this);
        layoutManager = new GridLayoutManager(this, 2);
        myRecycler.setLayoutManager(layoutManager);

        //asignarle un adaptador
        crearArray();
        ProductAdapter myAdapter = new ProductAdapter(myProducts, new ProductAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Product product) {
                Toast.makeText(AddProduct.this, "Nombre: " + product.getNombre() + "\nPrecio: " + product.getPrecio(), Toast.LENGTH_SHORT).show();
            }
        });
        myRecycler.setAdapter(myAdapter);

    }

    private void crearArray() {
        myProducts[0] = new Product("CocaCola", 2, "");
        myProducts[1] = new Product("Nestea", 1.5, "");
        myProducts[2] = new Product("Bifrutas", 3, "");

    }
}
