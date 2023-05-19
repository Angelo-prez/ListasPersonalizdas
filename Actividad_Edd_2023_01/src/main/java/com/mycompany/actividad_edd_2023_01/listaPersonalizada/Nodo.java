package com.mycompany.actividad_edd_2023_01.listaPersonalizada;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    //variable para conectar al nodo que le sigue.
    Nodo sigteNodo;
    //variable en la cual se va ha guardar el valor.
    int valor;
    
    public Nodo(){
    
    }

    public Nodo(int valor, Nodo sigteNodo) {
        this.valor = 0;
        this.sigteNodo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSigteNodo() {
        return sigteNodo;
    }

    public void setSigteNodo(Nodo sigteNodo) {
        this.sigteNodo = sigteNodo;
    }

    //Conculta si la lista esta vacia o sino tiene ningun elementos.
    public boolean estaVacia() {
        return sigteNodo == null;
               
    }

    //Elimina la lista.
    public void eliminar() {
        sigteNodo = null;
        //elimina el valor de los nodos.
        valor = 0;
        //devuelve el contador a cero.
    }

    //Muestra los elementos de las lista.
    public void mostrarLista() {
        //Verifica si la lista esta vacia.
        if (!estaVacia()) {
            //crea copia de la lista.
            Nodo temp = sigteNodo;
            //Posicion de los elemtos de la lista.
            int index = 0;
            //Recorre la lista hasta llegar al final.
            while (temp != null) {
                //Imprime el valor de nodo en la lista.
                System.out.println(index + "[ " + temp.getValor() + " ]");
                //Sigue al siguiente nodo.
                temp = temp.getSigteNodo();
                //Incrementa el contador de la posicion de la lista.
                index++;
            }
        }
    }

    //Busca si el valor se encuentra en la lista.
    public boolean buscar(int referencia) {//Busca el valor si existe en la lista.
        Nodo temp = sigteNodo;//Crea una copia de la lista.
        boolean encontrado = false;//indica si el valor existe.
        while (temp != null && encontrado != true) {//Recorre la lista hasta llegar al final o encontrar el elementos.
            if (referencia == temp.getValor()) {//Mira si el valor es el valor es igual a la referencia.
                encontrado = true;
            } else {
                temp = temp.getSigteNodo();//Cambia el valor a verdadero.
            }
        }
        return encontrado;//regresa el valor encontrado.
    }

    //Obtiene el valor de un nodo en una determinada posición en la lista.
    public int ObtenerValor(int posicion) throws Exception {
        if (posicion >= 0 && posicion <= valor) {//Verifica si la posicion ingresada se encuentra en el rango.
            if (posicion == 0) {//Verifica si la posición es el principio de la lista.
                return sigteNodo.getValor();//Retorna el valor del inicio de la lista.
            } else {
                Nodo temp = sigteNodo;//Crea una copia de la lista
                for (int i = 0; i < posicion; i++) {//Recorre la lista hasta la posicion ingresada.
                    temp = temp.getSigteNodo();
                }
                return temp.getValor();//Retorna el valor del nodo.
            }
        } else {//Crea una excepcion de la posicion inexistente en la lista.
            throw new Exception("!Posición no se encuentraen la lista¡");
        }
    }

    //Muestra la posicion de un elemento en la lista.
    public int getPosicion(int referencia) throws Exception {
        if (buscar(referencia)) {//Busca si el valor esta en la lista.
            Nodo temp = sigteNodo;//Crea una copia de la lista.
            int contador = 0;//Contador de posicion al nodo.
            while (referencia != temp.getValor()) {//Recorre la lista hasta encontrar el nodo.
                contador++;//Incrementa el contador.
                temp = temp.getSigteNodo();//Avanza al siguiente nodo.
            }
            return contador;//Retorna el valor que se encuentra en el contador.
        } else {
            //Crea un aviso de excepcion si el valor no se encuentra en la lista.
            throw new Exception("Valor nose encuentra en la lista");
        }

    }

    //Agrega un nuevo nodo al final de la lista.
    public void agregarAlFinal(int valor) {
        Nodo nuevo = new Nodo();//Se define un nuevo nodo.
        nuevo.setValor(valor);//Agrega el valor al nodo.
        if (estaVacia()) {//Pregunta si esta vacia la lista.
            sigteNodo = nuevo;//Inicia la lista con un nuevo Nodo si esta esta vacia.
        } else {
            Nodo temp = sigteNodo;//Esto crea una copia de la lista.
            while (temp.getSigteNodo() != null) {//Recorre la lista hasta llegar al final de ella.
                temp = temp.getSigteNodo();
            }
            temp.setSigteNodo(nuevo);//Agrega el nuevo nodo ala lista en el final.
        }
        valor++;//Incrementa el tamaño de la lista.

    }

    //Agrega un nuevo nodo al comienzo de la lista.
    public void agregarAlInicio(int valor) {
        Nodo nuevo = new Nodo();//Se define un nuevo nodo.
        nuevo.setValor(valor);//Se agrega el valor al nodo.
        if (estaVacia()) {//Consulta si la lista esta vacia o no tiene elementos.
            sigteNodo = nuevo;//Inicializa la lista con un nuevo nodo en el inicio.
        } else {
            nuevo.setSigteNodo(nuevo);//Conecta el nuevo nodo con el siguiente de la lista.
            sigteNodo = nuevo;//Renombra el nuevo nodo como el primero de la lista.
        }
        valor++;//Incrementa el tamaño de lalista cada vez que se agrega un valor nuevo.
    }
    
    public static void main(String[]args){
        Nodo var1 = new Nodo();
        var1.agregarAlFinal(23);
        var1.agregarAlFinal(3);
        var1.agregarAlFinal(76);
        var1.agregarAlFinal(9);
        var1.agregarAlFinal(11);
        var1.mostrarLista();
        
    }
}
