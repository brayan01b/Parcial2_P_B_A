package com.example.bdroomguiaejemplo.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.bdroomguiaejemplo.Model.Venta

@Dao
interface VentaDao {
    @Insert
    suspend fun insertVenta(venta: Venta)

    @Query("SELECT * FROM ventas")
    suspend fun getAllVentas(): List<Venta>
}
