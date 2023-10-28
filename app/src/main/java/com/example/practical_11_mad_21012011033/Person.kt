package com.example.practical_11_mad_21012011033

import org.json.JSONObject
import java.io.Serializable

class Person(
    var id:String,
    var name: String,
    var emailId: String,
    var phoneNo: String,
    var address: String,
    var ltitude: Double,
    var longitude:Double):Serializable
{
    /*
   * [
   * {"_id":"5f8d677c68d8ae7ceab6a732",
   * "name":{"first":"Lloyd","last":"York"},
 package com.Krima Jegoda.mad_practical_10_21012011033

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import org.w3c.dom.Text

class PersonAdapter(context:Context,val array: ArrayList<Person>):ArrayAdapter<Person>(context,0,array)
{
   override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.person_icon,parent,false)
       val persondata = array.get(position)
       view.findViewById<TextView>(R.id.textview1).text = persondata.name
       view.findViewById<TextView>(R.id.textview1).text = persondata.name
       view.findViewById<TextView>(R.id.textview1).text = persondata.name
       view.findViewById<TextView>(R.id.textview1).text = persondata.name
       return view
   }
}

 * "email":"lloyd.york@undefined.net",
   * "phone":"+1 (817) 545-3660",
   * "address":"311 Livonia Avenue, Belva, Ohio, 6019"}*/
    constructor(jsonObject: JSONObject):this("1","Krima","abc123@gmail.com","1234567891","afgdvbv153",0.0,0.0) {
        id = jsonObject.getString("id")
        emailId = jsonObject.getString("email")
        phoneNo = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        name = profileJson.getString("name")
        address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        var latitude = locationJson.getDouble("lat")
        longitude = locationJson.getDouble("long")
    }
}