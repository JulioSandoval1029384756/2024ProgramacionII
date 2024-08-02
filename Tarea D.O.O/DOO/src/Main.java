public class Main {
    public static void main(String[] args) {
        // Crear sucursales
        Sucursal bogota = new Sucursal("Cafetería Bogotá", "Calle 123, Bogotá");
        Sucursal roma = new Sucursal("Cafetería Roma", "Via Roma 45, Roma");


        Empleado juan = new Empleado("Juan", "Barista", 1000);
        Empleado maria = new Empleado("Maria", "Cajera", 900);
        bogota.agregarEmpleado(juan);
        bogota.agregarEmpleado(maria);

        Ingrediente granosColombianos = new Granos("Colombiano", 100);
        Ingrediente agua = new Agua(1000);
        Ingrediente lecheDeslactosada = new Leche("Deslactosada", 500);
        bogota.agregarIngrediente(granosColombianos);
        bogota.agregarIngrediente(agua);
        bogota.agregarIngrediente(lecheDeslactosada);

        Equipo cafetera = new Equipo("Cafetera", "Operativo");
        Equipo molino = new Equipo("Molino", "Requiere Mantenimiento");
        bogota.agregarEquipo(cafetera);
        bogota.agregarEquipo(molino);

        Cafe cafeColombiano = new CafeColombiano("Grande", 4.5, "Arabica");
        Cafe espressoItaliano = new EspressoItaliano("Pequeño", 3.0, 5);
        bogota.agregarEspecialidad(cafeColombiano);
        roma.agregarEspecialidad(espressoItaliano);

        juan.trabajar();
        maria.tomarOrden();
        cafetera.encender();
        cafeColombiano.preparar();
        cafeColombiano.servir();
    }
}