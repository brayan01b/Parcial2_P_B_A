package com.example.bdroomguiaejemplo.DAO
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.bdroomguiaejemplo.Model.Cliente

@Dao
interface ClienteDao {
    @Insert
    suspend fun insertCliente(cliente: Cliente)

    @Query("SELECT * FROM clientes")
    suspend fun getAllClientes(): List<Cliente>
}
