/*Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)
Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)
*/
class PhoneBook {
    var size = 0
    var myContact = arrayListOf<Contacts>()

    constructor() {
        myContact = ArrayList<Contacts>(this.size)
        this.size = 10
    }

    constructor(size: Int) {
        this.myContact = ArrayList(size)
        this.size = size
    }

    /*Añadir contactos*/
    fun aniadirContacto(c: Contacts) {
        myContact.add(c)
    }


    /* existeContacto(Conctacto c): indica si el contacto pasado existe o no.*/
    fun existeContacto(c: Contacts): Boolean {
        var flag = false
        for (contact in myContact) {
            if (contact.name.equals(c.name))
                flag = true
        }
        return flag
    }


    /*listarContactos(): Lista toda la agenda*/

    fun listarContacto() {
        for (contact in myContact)
            println(imprimirContacto(contact))
    }

    fun imprimirContacto(c: Contacts): String {
        return "Contact :" + c.name + " Mobile: " + c.phoneNumber
    }


    /*buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.*/
    fun buscaContacto(nombre: String): String {
        var tel = ""
        for (contact in myContact) {
            if (contact.name.equals(nombre)) {
                tel = contact.phoneNumber
                break
            }
        }
        return tel
    }

    /*eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla*/
    fun eliminarContacto(c: Contacts) {
        if (existeContacto(c)) {
            myContact.remove(c)
            println("El contacto ha sido eliminado")
        }
    }

    /*agendaLlena(): indica si la agenda está llena*/
    fun agendaLlena() {
        if (myContact.size < this.size) {
            println("La agenda tiene espacio")
        } else {
            println("La agenda esta llena")
        }

    }

    /*huecosLibres(): indica cuantos contactos más podemos meter.*/
    fun huecosLibres(): Int {
        return this.size - myContact.size
    }
}