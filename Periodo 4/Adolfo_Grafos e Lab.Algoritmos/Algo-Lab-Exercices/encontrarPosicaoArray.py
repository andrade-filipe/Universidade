def find_position(value, arr, cut_array, previous_cut):
    print("valor: ", value)
    print("carr: ", cut_array)
    print("pcut: ", previous_cut)
    # se o valor for igual ao valor encontrado no index de corte, entra na posição do corte
    if value == arr[cut_array]:
        return cut_array

    # em todos os outros casos
    else:
        # se o valor for MENOR que o valor no MEIO do array
        if value < arr[cut_array]:
            print("valor no index do meio:", arr[cut_array])
            # esse if verifica se o corte atual é --> MAIOR <-- que o ANTERIOR
            # pois se isso acontecer significa que o indice no numero que estou
            # procurando está ENTRE o corte ANTERIOR e o ATUAL, ou seja, separa-se
            # uma parte menor do array, e faz a iteração.
            if cut_array >= previous_cut:
                i = 0
                while i <= abs(cut_array - previous_cut):
                    index = i + previous_cut

                    if arr[index] == value:
                        return index

                    elif arr[index - 1] < value < arr[index]:
                        return index

                    elif previous_cut == 0:
                        return 1

                    else:
                        i += 1

            # divide o array no MEIO de novo e faz uma nova busca
            new_cut = cut_array // 2
            print("newcut menor: ", new_cut)
            find_position(value, arr, new_cut, cut_array)

        # se o valor for MAIOR que o do meio do array
        elif value > arr[cut_array]:
            print("valor no index do meio:", arr[cut_array])
            # esse if verifica se o corte atual é --> MENOR <-- que o ANTERIOR
            # pois se isso acontecer significa que o indice no numero que estou
            # procurando está ENTRE o corte ANTERIOR e o ATUAL, ou seja, separa-se
            # uma parte menor do array, e faz a iteração.
            if cut_array <= previous_cut:
                i = 0
                while i <= abs(previous_cut - cut_array):
                    index = i + previous_cut

                    if arr[index] == value:
                        return index

                    elif arr[index - 1] < value > arr[index]:
                        return index

                    elif previous_cut == 0:
                        return 1

                    else:
                        i += 1

            # soma a Metade do array(cut_array) com a metade da metade (cut_array // 2)
            # o resultado é o indice do meio da "parte 2" do array
            # explico a "parte 2" com esse exemplo: array: {1, 2, 3, 4, 5, 6, 7, 8}
            # parte 1: {1,2,3,4}
            # parte 2: {5,6,7,8}
            # Observe que a operação abaixo obtém o INDICE do numero 7 nesse exemplo :)

            new_cut = (cut_array // 2) + cut_array
            print("newcut maior: ", new_cut)
            find_position(value, arr, new_cut, cut_array)
        else:
            return -1


def return_position(value, arr):
    array_int = [int(x) for x in arr.split(" ")]

    ## Implemente sua solução nesta função. Ela deve retornar a posição do value no array.
    arr_size = len(array_int) - 1
    cut_array = arr_size // 2
    previous_cut = cut_array

    # se o valor for menor que o primeiro valor do array, entra na primeira posição
    if value < array_int[0]:
        return 0

    # se o valor for maior que o ultimo valor do array, entra na ultima posição
    elif value > array_int[len(array_int) - 1]:
        return len(array_int)

    else:
        return find_position(value, array_int, cut_array, previous_cut)


def main():
    while True:
        valor = int(input())
        if valor == -1:
            break

        array = input()
        position = return_position(valor, array)
        print(position)


if __name__ == "__main__":
    main()
