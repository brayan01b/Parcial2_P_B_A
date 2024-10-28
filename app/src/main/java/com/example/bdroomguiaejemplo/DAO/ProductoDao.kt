package com.example.bdroomguiaejemplo.DAO
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.bdroomguiaejemplo.Model.Producto

@Dao
interface ProductoDao {
    @Insert
    suspend fun insertProducto(producto: Producto)

    @Query("SELECT * FROM productos")
    suspend fun getAllProductos(): List<Producto>
}
