import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.bdroomguiaejemplo.Model.Cliente
import com.example.bdroomguiaejemplo.Model.Producto
import com.example.bdroomguiaejemplo.Model.Venta
import com.example.bdroomguiaejemplo.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Asegúrate de que apunte al archivo XML correcto

        // Inicializar la base de datos
        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "mi_base_datos")
            .fallbackToDestructiveMigration()
            .build()

        // Insertar datos de prueba
        CoroutineScope(Dispatchers.IO).launch {
            val producto = Producto(nombre = "Producto A", precio = 10.99, stock = 20)
            db.productoDao().insertProducto(producto)

            val cliente = Cliente(nombre = "Cliente A", correo = "clienteA@example.com")
            db.clienteDao().insertCliente(cliente)

            val venta = Venta(producto_id = 1, cliente_id = 1, cantidad = 2, fecha = "2024-10-27")
            db.ventaDao().insertVenta(venta)

            val productos = db.productoDao().getAllProductos()
            val clientes = db.clienteDao().getAllClientes()
            val ventas = db.ventaDao().getAllVentas()

            // Aquí puedes manejar los datos obtenidos
        }
    }
}
