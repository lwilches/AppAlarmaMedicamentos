package com.example.appalarmamedicamentos.ui.listadoAlarmas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appalarmamedicamentos.R
import com.example.appalarmamedicamentos.data.listadoalarmas.ItemAlarma
import com.example.appalarmamedicamentos.ui.listadoMedicamentos.AdapaterMedicamentosList


class ListadoAlarmasActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterAlarmaList

    private val itemList : List<ItemAlarma> = listOf(
        ItemAlarma("medicamento 1", "medicamento para le dolor de cabeza " ,"1", "Jueves 8:00" ) ,
        ItemAlarma("medicamento 2" , "Medicamento para le dolor de espalda" ,"1", "Jueves 8:00")
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_alarmas)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = AdapterAlarmaList(itemList)
        recyclerView.adapter = adapter

    }
}