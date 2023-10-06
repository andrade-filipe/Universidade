# importando a biblioteca

import networkx as nx
import math

# importação da biblioteca para plotagem de gráficos
import matplotlib.pyplot as plt


def exibir_grafo_q3(grafo):
    options = {
        'node_color': 'darkblue',
        'edge_color': '#808080',
        'node_size': 300,
        'width': 2,
        'font_color': 'white',
        'font_weight': 'bold',
        'font_size': 10

    }
    plt.figure(1)

    nx.draw_networkx(
        grafo,
        pos=nx.spring_layout(grafo),
        with_labels=True,
        **options
    )

    plt.show()


# Copie e cole nessa célula o algoritmo que será utilizado. Modifique-o e indique as linhas que serão modificadas.

# Busca em Largura
# Entrada: Lista de Parentes e o Grafo da rede social
# Saída: 1. Lista com os parentes conectados diretamente e indiretamente,
#        2. Parentes mais Próximos,
#        3. Distância de cada parente.

def distancia_parentes(subgraph_):
        print(f"distância máxima dos parentes: {dict(nx.eccentricity(subgraph_))}" )


def imprimir_resposta(parents_list, graph_):
    for parent in parents_list:
        neighbors = []
        for node in graph_.neighbors(parent):
            neighbors.append(node)
        print(f"Parentes mais proximos de {parent}: {neighbors}")


def bfs(parents_list, graph_):
    queue_ = []
    visited_ = []
    explored_ = []

    queue_.append(parents_list[0])
    visited_.append(parents_list[0])

    while queue_:
        current_node = queue_.pop(0)
        explored_.append(current_node)
        for node in graph_.neighbors(current_node):
            if node not in visited_:
                queue_.append(node)
                visited_.append(node)

    if len(parents_list) != len(explored_):
        for i in range(len(explored_)):
            parents_list.remove(explored_[i])

        bfs(parents_list, graph_)

    #Faço isso para imprimir a distancia dos parentes
    subgraph_ = graph_.subgraph(explored_)
    distancia_parentes(subgraph_)

    print(explored_)
    return explored_


def main():
    # Instanciando o objeto Grafo
    g3 = nx.Graph()

    # Adicionando os Vértices
    g3.add_nodes_from(
        ["P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10", "P11", "P12", "P13", "P14", "P15", "P16", "P17",
         "P18"])

    # Adicionando as Arestas
    g3.add_edge("P1", "P2")
    g3.add_edge("P1", "P4")
    g3.add_edge("P2", "P4")
    g3.add_edge("P3", "P4")
    g3.add_edge("P3", "P5")
    g3.add_edge("P3", "P6")
    g3.add_edge("P4", "P6")
    g3.add_edge("P5", "P6")
    g3.add_edge("P6", "P12")
    g3.add_edge("P7", "P8")
    g3.add_edge("P7", "P9")
    g3.add_edge("P8", "P9")
    g3.add_edge("P10", "P11")
    g3.add_edge("P10", "P12")
    g3.add_edge("P11", "P12")
    g3.add_edge("P11", "P13")
    g3.add_edge("P12", "P14")
    g3.add_edge("P13", "P14")
    g3.add_edge("P15", "P16")
    g3.add_edge("P15", "P17")
    g3.add_edge("P16", "P17")
    g3.add_edge("P17", "P18")

    # Aplique o algoritmo ao grafo G3 e mostre o resultado.
    parents_list = ["P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10", "P11", "P12", "P13", "P14", "P15",
                    "P16", "P17", "P18"]

    imprimir_resposta(parents_list, g3)
    bfs(parents_list, g3)


if __name__ == '__main__':
    main()
