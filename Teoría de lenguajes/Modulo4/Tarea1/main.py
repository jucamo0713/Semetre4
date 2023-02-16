# 1. Definir una función filter que imprima los primos que existen en el rango de 1 a tope (i.e. range(1,tope+1)).
# De esta forma, la función de orden superior filter debe utilizar una función booleana llamada “esprimo(n)” la cual devuelve True si el n es primo y False en caso contrario.
# La variable tope se obtiene como parametro de entrada de una función, asi:
import time
import timeit


def esprimo(num):
    for i in range(2, num):
        if num % i == 0:
            return False
        elif num // i < i:
            return True
    return True


def filterprimo(tope):
    # Aqui va su codigo, por favor no borrar la linea de abajo, esto ayuda a validar los resultados en minaslap
    listaprimo = filter(lambda x: esprimo(x), range(2, tope + 1))
    listaprimos = [y for y in listaprimo]
    return listaprimos


# 2. Utilizar la noción de generador para crear una función gen_primos(N) que devuelva una lista con los numeros primos hasta N.
# La función gen_primos utiliza la función booleana esprimo(i) para determinar si i es primo (True) o no (False).


def gen_primos(tope):
    return [y for y in range(2, tope + 1) if esprimo(y)]


# 3. Programar Factorial Recursivo Cola (Tail).
def tailFactorialP(i, ac, n):
    if i > n:
        return ac
    return tailFactorialP(i + 1, ac * i, n)


def tailFactorial(n):
    return tailFactorialP(1, 1, n)


# Aqui va su codigo, tambien debe rellenar los parametros de la funcion y el retorno

# comparacion de factorial normal
def factorial(n):
    if n <= 0:
        return 1
    else:
        return n * factorial(n - 1)


# 4. Programar Fibonacci Simple (n) y Fibonacci Recursivo Cola (n).
def fibonacci(n):
    if n in [1, 2]:
        return 1
    return fibonacci(n - 1) + fibonacci(n - 2)


# aqui va su codigo, tambien debe rellenar los parametros de la funcion y el retorno

def tailfibonacciP(n, n1, n2, i):
    if n in [1, 2]:
        return 1
    elif n < i:
        return n2
    return tailfibonacciP(n, n2, n1 + n2, i + 1)


def tailfibonacci(n):
    return tailfibonacciP(n, 1, 1, 3)


# aqui va su codigo, tambien debe rellenar los parametros de la funcion y el retorno


# 5. DarkSouls de los DarkSouls
def all_subset(n, subset, elements):
    ac = []
    sub = subset.copy()
    if n == 0:
        if len(sub) > 0:
            ac.append(sub)
    else:
        ac += all_subset(n - 1, sub, elements)
        ac += all_subset(n - 1, sub + [elements[n - 1]], elements)
    return ac


def subconjunto(list):
    return all_subset(len(list), [], list)



# aqui va su codigo, tambien debe rellenar los parametros de la funcion y el retorno

def existe(peso, lista):
    subs = subconjunto(lista)
    elements = [y for y in filter(lambda x: sum(x) == peso, subs)]
    elements = map(lambda x: sorted(x), elements)
    elements = sorted(elements, key=lambda x: (len(x), x))
    return [y for y in elements]


# aqui va su codigo, tambien debe rellenar los parametros de la funcion y el retorno
# en esta funcion debe devolver los subconjuntos que cumplan con el enunciado