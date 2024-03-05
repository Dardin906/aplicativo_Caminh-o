package com.example.kmrodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.example.kmrodados.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCalcular = findViewById<Button>(R.id.btnCalcular)
        btCalcular.setOnClickListener {
            val Quilometroid = findViewById<EditText>(R.id.edtKm)
            val lblSalarioid = findViewById<TextView>(R.id.edtSalario)
            val result = findViewById<TextView>(R.id.txtResultado)

            var km = Quilometroid?.text.toString().toDouble()
            var salario = lblSalarioid?.text.toString().toDouble()

            if (km <= 500.00) {
                val calc1 = (0.10/100.00 * salario * km) + salario
                result.text = calc1.toString()
            }
            else if (km>500.0 && km<=1000.0) {
                val calc2 = (0.15/100.00 * salario * km) + salario
                result.text = calc2.toString()
            }
            else if (km>1000.0 && km<=2000.0) {
                val calc3 = (0.20/100.00 * salario * km) + salario
                result.text = calc3.toString()
            }
            else if (km>2000.0) {
                val calc4 = (0.30/100.00 * salario * km) + salario
                result.text = calc4.toString()
            }
        }
    }
}
