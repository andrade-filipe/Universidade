import math
# Método que verifica se um aresta toca um conjunto
def touch_(set_, edge):
    node_a = edge[0] in set_;
    node_b = edge[1] in set_;

    return node_a != node_b


# Método que retorna o peso de uma aresta
def get_edge_data(graph, edge, data_):
    return graph.get_edge_data(edge[0], edge[1], data_)


# Método que retorna a aresta com menor peso dado um dicionário {aresta: peso}
def less_edge(dict_):
    less_value = math.inf
    edge_ = None
    for edge in dict_:
        if dict_[edge] < less_value:
            edge_ = edge
            less_value = dict_[edge]

    return edge_


# Método que retorna a árvore geradora mínima
def return_gmin(grafo_):
    all_nodes = list(grafo_.nodes())
    all_edges = list(grafo_.edges())

    min_tree_edges = []

    B = [all_edges[0][0]]

    while set(all_nodes) != set(B):

        all_touch = {}

        for edge in list(all_edges):
            if touch_(B, edge):
                all_touch[edge] = get_edge_data(grafo_, edge, 'weigth')['weight']

        less_ = less_edge(all_touch)
        min_tree_edges.append(less_)

        if less_[1] not in B:
            B.append(less_[1])
        else:
            B.append(less_[0])

    G_min = grafo_.copy()
    weigth_gmin = 0

    for edge_g in list(G_min.edges()):
        if edge_g not in min_tree_edges:
            G_min.remove_edge(edge_g[0], edge_g[1])
        else:
            weigth_gmin += get_edge_data(grafo_, edge_g, 'weigth')['weight']

    return G_min, weigth_gmin