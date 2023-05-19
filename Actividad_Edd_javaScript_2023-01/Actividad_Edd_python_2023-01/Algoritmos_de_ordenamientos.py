
#Metodo burbuja
arreglo=[23, 7, 4, 82, 56, 222, 9, 1, 45, 90, 67]
def metodo_burbuja(arreglo):
    for i in range(len(arreglo)-1,0,-1):
        for j in range(i):
            if arreglo[j] > arreglo[j+1]:
                temporal = arreglo[j]
                arreglo[j]=arreglo[j+1]
                arreglo[j+1]=temporal

metodo_burbuja(arreglo)
print(arreglo)

#Metodo de insercion
arreglo=[23,5,87,34,6]
def metodo_insercion(arreglo):
    for i in range(1,len(arreglo)):
        elemento_por_insertar = arreglo[i]
        j = i-1
        while j >= 0 and arreglo[j] > elemento_por_insertar:
            arreglo[j+1]=arreglo[j]
            j-=1
        arreglo[j+1] = elemento_por_insertar

print("Lista sin ordenar",arreglo)
metodo_insercion(arreglo)
print("Lista ordenada",arreglo)

#Metodo de seleccion
arregloaleatorio=[4,67,34,22,8]

def metodo_seleccion(arreglo):
    for i in range(len(arreglo)):
        indice_valor_masBajo = i
        for j in range(i+1,len(arreglo)):
            if arreglo[j]< arreglo[indice_valor_masBajo]:
                indice_valor_masBajo=j
        arreglo[i],arreglo[indice_valor_masBajo]=arreglo[indice_valor_masBajo],arreglo[i]

metodo_seleccion(arregloaleatorio)
print(arregloaleatorio)

# Metodo Shell
def metodo_shell(vector):
    largo = 0
    for i in vector:
        largo += 1
    distancia = largo // 2
    while distancia > 0:
        for i in range(distancia, largo):
            val = vector[i]
            j = i
            while j >= distancia and vector[j - distancia] > val:
                vector[j] = vector[j - distancia]
                j -= distancia
            vector[j] = val
        distancia //= 2
    print("El arreglo ordenado es: ", vector)
arregloAleatorio = [34, 45, 654, 3, 19]
metodo_shell(arregloAleatorio)

# Metodo merge
vectormerge = [34, 2, 45, 123, 765, 9]
def metodo_merge(vectormerge):
    print("El vector a ordenar es:", vectormerge)

    def merge(vectormerge):
        def largo(vec):
            largovec = 0
            for _ in vec:
                largovec += 1
            return largovec
        if largo(vectormerge) > 1:
            medio = largo(vectormerge)//2

            izq = vectormerge[:medio]
            der = vectormerge[medio:]
            merge(izq)
            merge(der)
            i = j = k = 0
            while i < largo(izq) and j < largo(der):
                if izq[i] < der[j]:
                    vectormerge[k] = izq[i]
                    i += 1
                else:
                    vectormerge[k] = der[j]
                    j += 1
                k += 1
            while i < largo(izq):
                vectormerge[k] = izq[i]
                i += 1
                k += 1
            while j < largo(der):
                vectormerge[k] = der[j]
                j += 1
                k += 1
    merge(vectormerge)
    print("El vector ordenado es: ", vectormerge)
metodo_merge(vectormerge)

#Metodo Quick
vectorquick = [4, 56, 876, 234, 54, 23, 9]

def metodo_quick(vectorquick, start=0, end=len(vectorquick) - 1):
    print("El vector a ordenar es:", vectorquick)
    def quick(vectorquick, start=0, end=len(vectorquick) - 1):
        if start >= end:
            return
        def particion(vectorquick, start=0, end=len(vectorquick) - 1):
            pivot = vectorquick[start]
            menor = start + 1
            mayor = end
            while True:
                while menor <= mayor and vectorquick[mayor] >= pivot:
                    mayor = mayor - 1
                while menor <= mayor and vectorquick[menor] <= pivot:
                    menor = menor + 1
                if menor <= mayor:
                    vectorquick[menor], vectorquick[mayor] = vectorquick[mayor], vectorquick[menor]
                else:
                    break
            vectorquick[start], vectorquick[mayor] = vectorquick[mayor], vectorquick[start]
            return mayor
        p = particion(vectorquick, start, end)
        quick(vectorquick, start, p-1)
        quick(vectorquick, p+1, end)
    quick(vectorquick)
    print("El vector ordenado es:", vectorquick)
metodo_quick(vectorquick)


# Metodo heap
vectorheap = [34, 765, 98, 23, 83, 54, 9]


def heapsort(vectorheap):
    print("El vector a ordenar es:", vectorheap)
    largo = 0
    for _ in vectorheap:
        largo += 1

    def amontonar(vectorheap, n, i):
        mas_largo = i
        izq = 2 * i + 1
        der = 2 * i + 2
        if izq < n and vectorheap[i] < vectorheap[izq]:
            mas_largo = izq
        if der < n and vectorheap[mas_largo] < vectorheap[der]:
            mas_largo = der
        if mas_largo != i:
            vectorheap[i], vectorheap[mas_largo] = vectorheap[mas_largo], vectorheap[i]
            amontonar(vectorheap, n, mas_largo)

    def heap(vectorheap):
        n = largo
        for i in range(n//2 - 1, -1, -1):
            amontonar(vectorheap, n, i)
        for i in range(n-1, 0, -1):
            vectorheap[i], vectorheap[0] = vectorheap[0], vectorheap[i]
            amontonar(vectorheap, i, 0)

    heap(vectorheap)
    print("El vector ordenado es:", vectorheap)


heapsort(vectorheap)
