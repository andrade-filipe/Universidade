total_positivo = 0
total_negativo = 0
total_pares = 0
total_impares = 0



for i in range(0, 5):
    numero = int(input())

    # Coloque seu código nesse espaço
    if numero < 0:
        total_negativo += 1

    if numero > 0:
        total_positivo += 1

    if (numero % 2) == 0:
        total_pares += 1

    if (numero % 2) == 1:
        total_impares += 1


print("%i valor(es) par(es)" % total_pares)
print("%i valor(es) impar(es)" % total_impares)
print("%i valor(es) positivo(s)" % total_positivo)
print("%i valor(es) negativo(s)" % total_negativo)