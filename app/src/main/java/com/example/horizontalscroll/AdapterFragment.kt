package com.example.horizontalscroll

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AdapterFragment : Fragment() {
    private val list = mutableListOf<String>()
    private val adapter1 = EdittextAdapter(list)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_pager, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recView = view.findViewById<RecyclerView>(R.id.recView)
        recView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = adapter1
        }

        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")
        list.add("dfdf")

        adapter1.notifyDataSetChanged()


    }
}