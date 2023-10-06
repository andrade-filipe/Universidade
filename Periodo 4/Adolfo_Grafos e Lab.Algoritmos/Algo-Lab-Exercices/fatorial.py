def fatorial(n):
    if n > 1:
        n *= fatorial(n - 1)
    return n

def main():
    valor = int(input())
    valor_fatorial = fatorial(valor)

    print(valor_fatorial)

if __name__ == '__main__':
    main()