import networkx as nx
## Grafo de Teste ##

# Instanciando o objeto Grafo com pesos utilizar no algoritmo de menor caminho
G1 = nx.Graph()

# Adicionando os Vértices
G1.add_nodes_from(["a", "b", "c", "d", "e", "f", "g"])

# Adicionando as Arestas
G1.add_edge("a", "b", weight=1)
G1.add_edge("a", "d", weight=4)
G1.add_edge("b", "c", weight=2)
G1.add_edge("b", "d", weight=6)
G1.add_edge("b", "e", weight=4)
G1.add_edge("b", "f", weight=8)
G1.add_edge("c", "f", weight=6)
G1.add_edge("d", "e", weight=3)
G1.add_edge("d", "g", weight=4)
G1.add_edge("e", "g", weight=9)
G1.add_edge("e", "f", weight=8)
G1.add_edge("f", "g", weight=3)


## Algoritmo do Menor Caminho

# retorna o vértice com o menor valor da distância na tabela
# dentre os vértices que ainda não se conhece a menor distância
def get_less_table(table):
    selected = {k: v for k, v in table.items() if v['is_less'] == False}
    sorted_ = sorted(selected.items(), key=lambda kv: kv[1]['distance'])

    return sorted_[0][0]


# Algoritmo de Dijikstra
def less_path(graph, v):
    table_ = {v: {'is_less': True, 'distance': 0, 'path': ''}}
    found_ = [v]
    actual_node = v

    while set(found_) != set(list(graph.nodes())):

        all_neighbors = [x for x in list(nx.neighbors(graph, actual_node)) if x not in found_]
        for neigh in all_neighbors:
            new_distance = table_[actual_node]['distance'] + graph.get_edge_data(actual_node, neigh, 'weight')['weight']
            if neigh in table_.keys():
                if new_distance < table_[neigh]['distance']:
                    table_[neigh]['distance'] = new_distance
                    table_[neigh]['path'] = actual_node
            else:
                table_[neigh] = {'is_less': False, 'distance': new_distance, 'path': actual_node}

        actual_node = get_less_table(table_)
        table_[actual_node]['is_less'] = True
        found_.append(actual_node)

    return table_