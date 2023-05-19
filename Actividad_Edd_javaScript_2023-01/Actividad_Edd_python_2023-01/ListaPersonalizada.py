class Nodo():
    dato = None
    siguiente = None

    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None


def agregar_al_final(nodo_inicial, dato):
    nuevo_nodo = Nodo(dato)
    if nodo_inicial == None:
        nodo_inicial = nuevo_nodo
        return nodo_inicial
    temporal = nodo_inicial
    while temporal.siguiente:
        temporal = temporal.siguiente
    temporal.siguiente = nuevo_nodo
    return nodo_inicial


def agregar_al_inicio(nodo_inicial, dato):
    nuevo_nodo = Nodo(dato)
    nuevo_nodo.siguiente = nodo_inicial
    return nuevo_nodo

# Imprime la lista recorriendola
def imprimir_lista(nodo):
    while nodo != None:
        print(f"Tenemos {nodo.dato}")
        nodo = nodo.siguiente

# obtener_inicio nos regresa al comienzo, pero accedemos al dato para imprimirlo
def obtener_inicio(nodo_inicial):
    return nodo_inicial

# obtener_final nos regresa al final de la lista, pero accedemos al dato para imprimirlo
def obtener_final(nodo_inicial):
    temporal = nodo_inicial
    while temporal.siguiente:
        temporal = temporal.siguiente
    return temporal

# Comprueba si el dato que nosotros hemos introducido existe en la lista
def existe(nodo, busqueda):
    while nodo != None:
        if nodo.dato == busqueda:
            return True
        nodo = nodo.siguiente
    return False

# elimina el datos especificado si se encuentra en la lista
def eliminar_dato(nodo, busqueda):
    if nodo == None:
        return
    if nodo.dato == busqueda:
        return nodo.siguiente
    temporal = nodo
    while temporal.siguiente != None:
        if temporal.siguiente.dato == busqueda:
            if temporal.siguiente.siguiente != None:
                temporal.siguiente = temporal.siguiente.siguiente
            else:
                temporal.siguiente = None
                return nodo
        temporal = temporal.siguiente
    return nodo

# Metodo principal para ejecutar las demás funciones
def main():
    lista = None
    # Se agregan valores a la lista
    lista = agregar_al_final(lista, "manuel")
    lista = agregar_al_final(lista, "mario")
    lista = agregar_al_inicio(lista, "luisa")
    lista = agregar_al_inicio(lista, "angel")
    lista = agregar_al_inicio(lista, "pepe")
    lista = agregar_al_inicio(lista, "oscar")

    imprimir_lista(lista)  # Se comprueba que los datos estas guardados

    lista = eliminar_dato(lista, "mario")  # Seelimina un valor de la lista

    imprimir_lista(lista)  # se compruba que dicho valor fue eliminado

    print(existe(lista, "oscar"))  # Se pregunta si estos valores si existen
    print(existe(lista, "Luis"))

    print(obtener_inicio(lista).dato)  # se verifica cual es el valor inicial
    print(obtener_final(lista).dato)  # se verifica cual es el valor final


# Se ejecuta funcion main
main()
