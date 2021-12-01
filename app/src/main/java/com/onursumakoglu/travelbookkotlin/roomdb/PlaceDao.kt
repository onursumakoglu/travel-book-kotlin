package com.onursumakoglu.travelbookkotlin.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.onursumakoglu.travelbookkotlin.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface PlaceDao {

    @Query("SELECT * FROM Place")  // @Query("SELECT * FROM Place WHERE id= :id")
    fun getAll() : Flowable<List<Place>>           // fun getAll(id: String) : List<Place>  if wanted filter the data, we can use like that

    @Insert
    fun insert(place : Place) : Completable

    @Delete
    fun delete(place: Place) : Completable

}