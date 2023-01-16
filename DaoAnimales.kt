package DaoAnimales

import Animal.Animal

//Falta importar el DBHelper
public class DaoAnimales constructor(
    var animal:Animal) {

    fun find(region:Int): Animal {
        //Crear Funcion en la clase de Acceso a Base de datos DbHelper.kt
        //obtenerAnimalDbHelperxRegion(region) //DbHelper
        return animal

    }
    fun member (nombre:String): Boolean{
        //llamar a existeAnimalDbHelper(nombre)
        return false
    }
    fun insert (animal: Animal){
        //llamar a insertarAnimalDbHelper(nombre)
    }

    fun delete (nombre:String){
        //llamar a eliminarAnimalDbHelper(nombre)
    }

}







