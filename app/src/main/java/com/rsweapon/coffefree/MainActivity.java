package com.rsweapon.coffefree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int quantity;
private TextView coffeNo,prices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coffeNo=findViewById(R.id.coffeno);
        prices=findViewById(R.id.prices);

    }
    public void increment(View v)
    {
        quantity=quantity+1;
        display(quantity);
    }
    public  void decrement(View view)
    {
        if(quantity>0) {
        quantity=quantity-1;


            display(quantity);
        }
    }

    private void display(int quantity) {
        coffeNo.setText(""+quantity);
        if(quantity%4==0){
            prices.setText("Congratulation  1 Coffe Free  "+"Ammount due. "+quantity*20);
        }
        else {
            prices.setText("Rs. "+quantity*20);
        }

    }
}