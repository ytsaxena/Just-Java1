package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
 int quantity=0;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       // display (quantity);
      //  displayPrice(quantity*10);
        int price = quantity*10;
        String PriceMessage="Total = Rs "+ price + " for " + quantity + " Cup of Chai \n Thank You";
        displayMessage(PriceMessage);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }



    /*



    increment
     */
    public void increment(View view) {
        //int quantity =5;
        quantity=quantity+1;
        display (quantity);
        // displayPrice(quantity*10);
    }

    /*\
    decrement
     */
    public void decrement(View view)
    {
        //int quantity=2;
        if(quantity>0) {
            quantity = quantity - 1;
        }
            display(quantity);
        //  displayPrice(quantity*10);
    }


}