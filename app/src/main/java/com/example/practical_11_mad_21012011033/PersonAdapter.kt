package com.example.practical_11_mad_21012011033

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.android.material.button.MaterialButton
import java.sql.Array

class PersonAdapter (val context: Context, val personarray:ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>()
{
    inner class PersonViewHolder(val view:View):RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.person_item, parent, false)
        return PersonViewHolder(view)

    }

    override fun getItemCount(): Int {
        return personarray.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val view=holder.view
        view.findViewById<TextView>(R.id.textview1).text=personarray[position].name
        view.findViewById<TextView>(R.id.textview2).text=personarray[position].phoneNo
        view.findViewById<TextView>(R.id.textview3).text=personarray[position].emailId
        view.findViewById<TextView>(R.id.textview4).text=personarray[position].address
        view.findViewById<MaterialButton>(R.id.material_button_2).setOnClickListener {
            Intent(context, MapsActivity::class.java).putExtra("object",personarray[position]).apply { context.startActivity(this) }
        }
    }

}