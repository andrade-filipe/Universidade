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


## Algoritmo de Busca em Profundidade ##


def get_no_visted_neighbors(graph_, node, v):
  neighbors_node = [x for x in list(nx.neighbors(graph_, node)) if x not in v]
  if len(neighbors_node) > 0: return neighbors_node[0]
  else: None

def dfs_interative(graph, v, list_not_visited):

  stack_ = []
  visited_ = []
  explored_ = []

  stack_.append(v)
  visited_.append(v)
  list_not_visited.remove(v)

  while len(stack_) > 0:
    top_stack = stack_[-1]
    node_not_visited = get_no_visted_neighbors(graph, top_stack, visited_)
    if node_not_visited:
      stack_.append(node_not_visited)
      visited_.append(node_not_visited)
      list_not_visited.remove(node_not_visited)
    else:
      explored_.append(stack_.pop())

  return visited_, explored_


def dfs(graph):

  not_visited = list(graph.nodes())

  while len(not_visited) > 0:
    node_start = not_visited[0]
    visited, explored = dfs_interative(graph, node_start, not_visited)
    print("Visitados: %s" % visited)
    print("Explorados: %s" % explored)