package com.example.appalarmamedicamentos.ui.cambiopwd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appalarmamedicamentos.R

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_cambio_pwd.newInstance] factory method to
 * create an instance of this fragment.
 */
class CambioPwdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cambio_pwd, container, false)
    }


}