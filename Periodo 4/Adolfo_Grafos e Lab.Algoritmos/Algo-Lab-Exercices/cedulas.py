valor = int(input())

# Insira a partir daqui o código que calcula a distribuição de cédulas para valor
listaCedulas = [100, 50, 20, 10, 5, 2, 1]

print(valor)

i = 0
while i < len(listaCedulas):
    #define a sobra depois da contagem
    resto = valor % listaCedulas[i]

    #conta quantas cedulas serão necessárias
    contagemCedulas = int((valor - resto) / listaCedulas[i])

    #print direto no loop
    print("{} nota(s) de R$ {},00".format(contagemCedulas, listaCedulas[i]))

    #retira do valor original as cedulas já contadas
    valor = resto
    i += 1


