def contarSegundosAtivados(array_tempos):
    segundosAtivados = 0

    for i in range(len(array_tempos)):
        if i == 0:
            segundosAtivados += 10
        else:
            intervalo = int(array_tempos[i]) - int(array_tempos[i - 1])

            if intervalo < 10:
                segundosAtivados += intervalo
            else:
                segundosAtivados += 10

    return segundosAtivados


def main():
    while (True):

        # Lê o primeiro valor referente a quantidade de pessoas
        quantidade = int(input())

        # Finaliza a leitura se o valor de entrada for zero
        if quantidade == 0:
            break

        # Lê os valores de entrada que correspondem aos tempos
        tempos = input()

        # Como tempos é uma string, transformamos essa string em um array de valores
        array_tempos = tempos.split(" ")

        # Implemente a partir daqui a sua solução
        segundosAtivados = contarSegundosAtivados(array_tempos)
        print(segundosAtivados)

if __name__ == '__main__':
    main()