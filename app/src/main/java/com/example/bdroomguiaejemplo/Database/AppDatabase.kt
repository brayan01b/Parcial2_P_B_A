import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bdroomguiaejemplo.DAO.ClienteDao
import com.example.bdroomguiaejemplo.DAO.ProductoDao
import com.example.bdroomguiaejemplo.DAO.VentaDao
import com.example.bdroomguiaejemplo.Model.Cliente
import com.example.bdroomguiaejemplo.Model.Producto
import com.example.bdroomguiaejemplo.Model.Venta

@Database(entities = [Producto::class, Cliente::class, Venta::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productoDao(): ProductoDao
    abstract fun clienteDao(): ClienteDao
    abstract fun ventaDao(): VentaDao
}
