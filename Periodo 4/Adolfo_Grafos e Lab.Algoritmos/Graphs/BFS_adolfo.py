import networkx as nx
## Grafo de Teste ##

# Instanciando o objeto Grafo
G = nx.Graph()

# Adicionando os Vértices
G.add_nodes_from([1,2,3,4,5,6,7,8])

# Adicionando as Arestas
G.add_edges_from([
                  (1,2),(1,3),(2,4),(2,5),
                  (3,4),(4,5),(4,6),(6,7),(6,8),(7,8)
                  ])

## Algoritmo de Busca em Largura ##

# Função que retorna um vértice adjacente não-visitado
# de um vértice passado como parâmetro

def get_no_visted_neighbors_bfs(graph_, node, v):
  neighbors_node = [x for x in list(nx.neighbors(graph_, node)) if x not in v]
  if len(neighbors_node) > 0: return neighbors_node
  else: None


def bfs_interative(graph, v, list_not_visited):

  queue_ = []
  visited_ = []
  explored_ = []

  queue_.append(v)
  visited_.append(v)
  list_not_visited.remove(v)

  while len(queue_) > 0:
    first_queue = queue_[0]
    nodes_not_visited = get_no_visted_neighbors_bfs(graph, first_queue, visited_)
    if nodes_not_visited:
      for temp_node in nodes_not_visited:
        queue_.append(temp_node)
        visited_.append(temp_node)
        list_not_visited.remove(temp_node)

    explored_.append(queue_.pop(0))

  return visited_, explored_


def bfs(graph):

  not_visited = list(graph.nodes())

  while len(not_visited) > 0:
    node_start = not_visited[0]
    visited, explored = bfs_interative(graph, node_start, not_visited)
    print("Visitados: %s" % visited)
    print("Explorados: %s" % explored)