package com.example.appalarmamedicamentos.ui.listadoMedicamentos
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appalarmamedicamentos.R
import com.example.appalarmamedicamentos.data.listadomedicamentos.ItemMedicamento


class ListadoMedicamentosActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapaterMedicamentosList

    private val itemList : List<ItemMedicamento> = listOf(
        ItemMedicamento("medicamento 1", "medicamento para le dolor de cabeza " ,R.mipmap.ic_launcher ) ,
        ItemMedicamento("medicamento 2" , "Medicamento para le dolor de espalda" ,  R.mipmap.ic_launcher_round)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_medicamentos)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = AdapaterMedicamentosList(itemList)
        recyclerView.adapter = adapter
    }
}