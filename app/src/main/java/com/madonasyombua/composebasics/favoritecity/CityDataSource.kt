package com.madonasyombua.composebasics.favoritecity

class CityDataSource {
    fun loadCities(): List<City> {
        return listOf<City> (
            City(1, "Mzuzu", "Malawi")
            ,City(2, "MzimbA", "Malawi")
             ,City(3, "LILONGWE", "Malawi")
        )
    }
}