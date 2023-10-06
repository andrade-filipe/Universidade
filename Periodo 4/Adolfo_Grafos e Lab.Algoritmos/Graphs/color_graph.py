import networkx as nx
## Grafo de Exemplo ##

# Instanciando o objeto Grafo
G = nx.Graph()

# Adicionando os Vértices
G.add_nodes_from(['a', 'b', 'c', 'd', 'e', 'f', 'g'])

# Adicionando as Arestas
G.add_edges_from([
    ('a', 'b'), ('a', 'd'),
    ('b', 'c'), ('b', 'd'), ('b', 'e'), ('b', 'f'),
    ('c', 'f'),
    ('d', 'e'), ('d', 'g'),
    ('e', 'f'), ('e', 'g'),
    ('f', 'g')
])


## Algoritmo de Coloração ##

# Método que retorna os centros do grafo
def get_degree(node, graph):
    return graph.degree[node]


def get_ordered_nodes(graph):
    dict_nodes = {}

    for node in list(graph.nodes):
        dict_nodes[node] = get_degree(node, graph)

    sorted_dict = dict(sorted(dict_nodes.items(), key=lambda kv: kv[1], reverse=True))

    return list(sorted_dict.keys())


def test_neighbors_color(node, colors, color, graph):
    neigh_ = graph.neighbors(node)

    for neigh in neigh_:

        if neigh in colors.keys():
            if color == colors[neigh]:
                return True

    return False


# Associandos os vértices a cores

def apply_color(graph, colors):
    ordered_nodes = get_ordered_nodes(graph)

    pick_color = colors[0]
    colors_node = {}

    while len(ordered_nodes) > 0:
        pick_nodes = []
        for node in ordered_nodes:

            if (not test_neighbors_color(node, colors_node, pick_color, graph)):
                colors_node[node] = pick_color
                pick_nodes.append(node)

        ordered_nodes = [node for node in ordered_nodes if node not in pick_nodes]
        colors.remove(pick_color)

        if len(colors) > 0:
            pick_color = colors[0]
        else:
            break

    return colors_node