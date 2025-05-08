package com.boldaartur.atividade2404

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.boldaartur.atividade2404.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var biding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        //lista
        val items = listOf("masculino", "feminino")

        //objeto adapter
        val adapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, items)

        biding.spinnerSexo.adapter = adapter

        biding.buttonCalcular.setOnClickListener {
            val sexoSelecionado = biding.spinnerSexo.selectedItem as String
            var idade = biding.editTextIdade.text.toString().toLongOrNull()
            var resultado: Long
            if (idade != null){
                //condicao usando sexo
                if (sexoSelecionado.trim()=="masculino"){
                    resultado = 65 - idade
                }else{
                    resultado = 62 - idade
                }
                biding.textViewResultado.text="Faltam $resultado anos para você se aposentar"
            } else{
                //Mostra erro caso seja nulo
                biding.textViewResultado.text ="Informe uma idade"
            }

        }


    }
}