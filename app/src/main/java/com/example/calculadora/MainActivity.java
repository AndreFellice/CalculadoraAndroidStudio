package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText Num1= findViewById(R.id.Numero1);
        EditText Num2= findViewById(R.id.Numero2);
        TextView Resul= findViewById(R.id.Resultado);
        Button Sum= findViewById(R.id.Sumar);
        Button Rest= findViewById(R.id.Restar);
        Button Multi= findViewById(R.id.Multiplicar);
        Button Div= findViewById(R.id.Dividir);

Sum.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String Numero1 = Num1.getText().toString();
        String Numero2 = Num2.getText().toString();

        if (Num1.getText().toString().isEmpty()|| Num2.getText().toString().isEmpty()){
            Toast mytoast = Toast.makeText(getApplicationContext(), "Ingrese Todos los valores", Toast.LENGTH_LONG);
            mytoast.show();
        }
        int Resultado= Integer.parseInt(Numero1)+ Integer.parseInt(Numero2);
        Resul.setText("Resultado: "+ Resultado);
        Num1.setText("");
        Num2.setText("");


    }
});

Rest.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String Numero1 = Num1.getText().toString();
        String Numero2 = Num2.getText().toString();
        if (Num1.getText().toString().isEmpty()|| Num2.getText().toString().isEmpty()){
            Toast mytoast = Toast.makeText(getApplicationContext(), "Ingrese Todos los valores", Toast.LENGTH_LONG);
            mytoast.show();
        }
        int Resultado= Integer.parseInt(Numero1)- Integer.parseInt(Numero2);
        Resul.setText("Resultado: "+ Resultado);
        Num1.setText("");
        Num2.setText("");

    }
});

Multi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String Numero1 = Num1.getText().toString();
        String Numero2 = Num2.getText().toString();
        if (Num1.getText().toString().isEmpty()|| Num2.getText().toString().isEmpty()){
            Toast mytoast = Toast.makeText(getApplicationContext(), "Ingrese Todos los valores", Toast.LENGTH_LONG);
            mytoast.show();
        }
        int Resultado= Integer.parseInt(Numero1)* Integer.parseInt(Numero2);
        Resul.setText("Resultado: "+ Resultado);
        Num1.setText("");
        Num2.setText("");

    }
});

Div.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String Numero1 = Num1.getText().toString();
        String Numero2 = Num2.getText().toString();
        if (Num1.getText().toString().isEmpty()|| Num2.getText().toString().isEmpty()){
            Toast mytoast = Toast.makeText(getApplicationContext(), "Ingrese Todos los valores", Toast.LENGTH_LONG);
            mytoast.show();
        }
        int Resultado= Integer.parseInt(Numero1)/ Integer.parseInt(Numero2);
        Resul.setText("Resultado: "+ Resultado);
        Num1.setText("");
        Num2.setText("");
    }
});
    }
}