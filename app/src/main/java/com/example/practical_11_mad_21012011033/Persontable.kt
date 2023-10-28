package com.example.practical_11_mad_21012011033

class Persontable {
    companion object{
        val TABLE_NAME="Person"
        val COLUMN_ID="Id"
        val COLUMN_NAME="Name"
        val COLUMN_PHONENO="Number"
        val COLUMN_EMAIL_ID="Email_id"
        val COLUMN_ADDRESS="Address"
        val COLUMN_GPS_LAT="Gps_lat"
        val COLUMN_GPS_LONG="Gps_long"

        val CREATE_TABLE=("CREATE TABLE "+ TABLE_NAME+"("+ COLUMN_ID+"TEXT PRIMARY KEY,"
                + COLUMN_NAME+"TEXT,"
                + COLUMN_PHONENO+"TEXT,"
                + COLUMN_EMAIL_ID+"TEXT,"
                + COLUMN_ADDRESS+ "TEXT,"
                + COLUMN_GPS_LAT+"REAL,"
                + COLUMN_GPS_LONG+"REAL"+")")



    }
}