import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProductoScreen() {
    var nombreProducto by remember { mutableStateOf("") }
    var precioProducto by remember { mutableStateOf("") }
    var stockProducto by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = nombreProducto,
            onValueChange = { nombreProducto = it },
            label = { Text("Nombre del Producto") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = precioProducto,
            onValueChange = { precioProducto = it },
            label = { Text("Precio") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = stockProducto,
            onValueChange = { stockProducto = it },
            label = { Text("Stock") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            // Insertar producto en la base de datos
        }) {
            Text("Agregar Producto")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProductoScreen() {
    ProductoScreen()
}
