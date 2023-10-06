# -*- coding: utf-8 -*-
"""pacote *Plotly*

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1vbY3aFaIvHDlfMyanQGh3u5bkDxlUJ7O

# **Introdução ao Plotly**
---

[![LinkedIn](https://img.shields.io/badge/LinkedIn-DanielSousaAmador-cyan.svg)](https://www.linkedin.com/in/daniel-sousa-amador)
[![GitHub](https://img.shields.io/badge/GitHub-amadords-darkblue.svg)](https://github.com/amadords)
[![Medium](https://img.shields.io/badge/Medium-DanielSousaAmador-white.svg)](https://daniel-s-amador.medium.com/)



![img](https://prismic-io.s3.amazonaws.com/plotly%2F6ea9b995-cdd8-49cb-b058-38bd44c1982d_plotly-logo-01-stripe%402x.png)

O **Plotly**, bem antes de uma biblioteca para algumas linguagens de programação, é uma empresa! Isso, junto a grandes profissionais que têm utilizado seus produtos nos leva a ter uma credibilidade maior em utilizá-los também.

Seu foco é criar ferramentas de análise e visualização de gráficos, bem como facilitar o front end modelos de Machine Learning e Data Science.

As linguagens-alvo do Plotly são Python, R, MATLAB, Julia, Perl, JavaScript, dentre outras.Trabalha também com Arduino e REST.

Suas ferramentas são várias, então para não listar todas, as mais utilizadas em Python para Data Science e Análise de Dados são o [Chart Studio](https://plotly.com/chart-studio/), [Plotly Express](https://plotly.com/python/plotly-express/) e [Dash](https://plotly.com/dash/). 

[Aqui](https://plotly.com/python/getting-started/) algumas configurações iniciais, caso sejam necessárias.

Os motivos de usarmos a biblioteca:
* Fácil manipulação
* Esteticamente agradável
* Interativa
* Permite ser usada de forma online e offline


Para visualizar como trabalhar com o **Plotly** em **séries temporais**, clique [aqui](https://bit.ly/3dlSuLg).
"""

import pandas as pd
import numpy as np
# bibliotecas para trabalhar offline com a biblioteca
import plotly
import plotly.offline as py
import plotly.graph_objs as go # criará de fato os gráficos
from plotly.offline import plot, iplot
import cufflinks as cf # para conectar o plotly ao pandas
cf.go_offline()
plotly.offline.init_notebook_mode(connected = True)

"""Como pode ser visto na documentação:

Use `connected = True` se desejar que seus blocos de anotações tenham tamanhos de arquivo menores.
No caso em que `connected = False`, toda a biblioteca plotly.js
será carregado no bloco de notas, o que resultará em um aumento no tamanho do arquivo
de alguns megabytes. Além disso, porque a biblioteca será baixada
da web, você e seus visualizadores devem estar conectados à int:ernet para serem capaz de visualizar gráficos dentro deste notebook.

### Não é complicado!

A última importação necessária é da plotly.io. 

Ela é quem nos permitirá renderizar gráficos no Colab.

`pio.renderers` nos mostra todas as opções de renderização.
"""

import plotly.io as pio
pio.renderers

"""Como estamos no ambiente **colab** escolheremos o `renderers = 'colab'`."""

pio.renderers.default = 'colab'

"""Para iniciar os exemplos, vamos criar alguns dados com a biblioteca **Numpy**.

Sim, eu sei que Creta não é uma letra do alfabeto grego, mas fica intuitivo, não?
"""

df = pd.DataFrame(np.random.randn(50,4), columns=['Alfa','Beta','Creta','Delta'])
df.head()

"""- Veja que, em todos os gráficos é possível habilitar e desabilitar qualquer uma das linhas pela legenda à direita, clicando em cima.

- Os gráficos são exemplificativos, para demonstrar a facilidade em plotar, logo não se assuste com os gráficos estranhos. A intenção é mostrar que pode o mais, logo o menos também conseguiremos.

### Line plot

É o gráfico padrão do Plotly.
"""

df.iplot()

"""Vamos plotar agora os gráficos mais comuns de serem utilizados no dia-a-dia.

### Scatter plot
"""

df.iplot(kind='scatter', x='Alfa',y='Beta', mode='markers')

"""### Bar plot"""

df.Alfa.iplot(kind='bar')

df.Alfa.iplot(kind='bar')

df.sum().iplot(kind='bar')

"""### Horizontal Bar Plot"""

df.iplot(kind='barh')

"""### Múltiplos Bar plots

Barra múltiplas são um tipo de gráfico muito bom para visualizarmos antes e depois quando tratamos, por exemplo, de volume de venda ou estoque ou pesquisa de opinião etc.

Por isso iremos criar alguns dados novos para visualizarmos esse antes e depois.
"""

# criando dados
labels = ['Orientais', 'Amaderados', 'Frutais', 'Cítrico', 'Floral']
antes = [7, 6, 29, 23, 35]
depois = [5, 7, 20, 27, 41]

# configurações

antes = go.Bar(x = labels,
               y = antes,
               name = 'Antes')

depois = go.Bar(x = labels,
                y = depois,
                name = 'Depois')
# plotando

data = [antes, depois]
py.iplot(data)

# criando dados
labels = ['Orientais', 'Amaderados', 'Frutais', 'Cítrico', 'Floral']
antes = [7, 6, 29, 23, 35]
depois = [5, 7, 20, 27, 41]

# configurações, acrescentando cores

antes = go.Bar(x = labels,
               y = antes,
               name = 'Antes',
                marker = {'color': '#7ecfc9'})

depois = go.Bar(x = labels,
                y = depois,
                name = 'Depois',
                marker = {'color': '#04f7e3'})
# plotando

data = [antes, depois]
py.iplot(data)

"""### Stacked bar plot"""

# criando dados
labels = ['Orientais', 'Amaderados', 'Frutais', 'Cítrico', 'Floral']
antes = [7, 6, 29, 23, 35]
depois = [5, 7, 20, 27, 41]

# configurações

antes = go.Bar(x = labels,
               y = antes,
               name = 'Antes',
                marker = {'color': '#787878'})

depois = go.Bar(x = labels,
                y = depois,
                name = 'Depois',
                marker = {'color': '#04f7e3'})


data = [antes, depois]

# configurando layout

layout = go.Layout(title = 'Gráfico de barras Empilhados',
                   xaxis = {'title': 'Perfumes'},
                   yaxis = {'title': 'Antes e Depois'},
                   barmode = 'stack') # stack = pilha ou seja, barra empilhada
# plotando 

fig = go.Figure(data=data, layout=layout)
py.iplot(fig)

"""#Scattergeo

Para mais [aqui](https://plotly.com/python/scatter-plots-on-maps/)

O código foi retirado do [artigo](https://paulovasconcellos.com.br/como-criar-gr%C3%A1ficos-interativos-utilizando-plotly-e-python-3eb6eda57a2b) do Paulo Vasconcellos no Medium.

Sempre que houve latitude e longitude é possível esse tipo de trabalho com mapas.
"""

df = pd.read_csv('https://raw.githubusercontent.com/plotly/datasets/master/2014_us_cities.csv')
df.head()

trace = go.Scattergeo(
                     locationmode = 'USA-states',
                     lon = df['lon'],
                     lat = df['lat'],
                     text = df['name'] + '- População: ' + df['pop'].astype(str),
                     marker = dict(
                            size = df['pop']/5000,
                            color = '#e74c3c',
                            line = {'width': 0.5, 
                                    'color': '#2c3e50'},
                            sizemode = 'area')
                    )
data = [trace]

layout = go.Layout(
        title = '<b>População americana em 2014</b>',
        titlefont = {'family': 'Arial',
                     'size': 24},
        geo =  {'scope': 'usa',
                'projection': {'type': 'albers usa'},
                'showland': True,
                'landcolor': '#2ecc71',
                'showlakes': True,
                'lakecolor': '#3498db',
                'subunitwidth': 1,
                'subunitcolor': "rgb(255, 255, 255)"
                })

fig = go.Figure(data=data, layout=layout)
py.iplot(fig)

"""### Boxplot"""

df = pd.DataFrame(np.random.randn(50,4), columns=['Alfa','Beta','Creta','Delta'])
df.head()

df.iplot(kind='box')

"""### Histograma"""

df['Beta'].iplot(kind='hist')

"""### Histogramas aninhados"""

df.Alfa.iplot(kind='hist')

df.iplot(kind='hist')

"""# Spread plots

*Spread* significa propagação. Um *spread plot* pode ser compreendido como um gráfico de propagação e mostra basicamente a dispersão dos dados.
"""

df.iplot(kind='spread')

"""### Bubble Plots"""

df.iplot(kind='bubble', x='Alfa',y='Beta', size='Creta', colors='seagreen')

"""### Scatter Matrix

Semelhante ao [pairplot](https://seaborn.pydata.org/generated/seaborn.pairplot.html) da Seaborn.
"""

df.scatter_matrix()

"""# Marcadores"""

# Gráfico usando apenas marcadores
trace1 = go.Scatter(x = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio'],
                    y = [1, 2, 3, 4, 5],
                    mode = 'markers',
                    name = 'Apenas marcadores')

# Gráfico de apenas linhas
trace2 = go.Scatter(x = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio'],
                    y = [7, 8, 9, 10, 11],
                    mode = 'lines',
                    name = 'Apenas linhas')

# Criando gráfico com marcadores e linhas
trace3 = go.Scatter(x = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio'],
                    y = [12, 13, 14, 15, 16],
                    mode = 'markers+lines',
                    name = 'Marcadores e Linhas')

data = [trace1, trace2, trace3]

py.iplot(data)

# Gráfico usando apenas marcadores
trace1 = go.Scatter(x = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio'],
                    y = [8, 9, 10, 11, 12],
                    mode = 'lines',
                    name = 'Gráfico com linhas tracejadas',
                    line = {'color': '#ee5253',
                            'dash': 'dash'})

# Gráfico de apenas linhas
trace2 = go.Scatter(x = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio'],
                    y = [10, 12, 11, 14, 15],
                    mode = 'lines',
                    name = 'Gráfico com linha pontilhada',
                    line = {'color': '#341f97',
                            'dash': 'dot'})

data = [trace1, trace2]

py.iplot(data)

"""# Trabalhando com Dados Reais
Disponibilizado pelo [Minerando Dados](https://minerandodados.com.br/)
"""

df = pd.read_csv('olist_classified_public_dataset.csv')
df.head()

"""
Perguntas aos dados¶

- Quais a distribuição dos status dos pedidos?
- Quais os meses do ano houve mais vendas?
- Qual a quantidade de items de um pedido? (medio)
- Qual a quantidade de vendedores em um pedido ? (medio)
- O valor do frete tende aumentar com o preco do produto?
- Qual o tempo medio de entrega?
- Como foi as vendas por mês?
- Quais meses superaram a meta de vendas?
- Como foi a venda por mês se comparado ao ano de 2016?


"""

df.order_status.value_counts().iplot(kind='bar')

# transformando colunas para datetime
df.order_purchase_timestamp = pd.to_datetime(df.order_purchase_timestamp)

df.info()

# metodo to_period('M') para pegar os meses
# criando colunas com os meses
df['order_purchase_month'] = df.order_purchase_timestamp.dt.to_period('M').astype(str)

df.order_purchase_month.head()

df.head()

# criando a variável vendas_por_mes (soma dos produtos agrupados por mes)
vendas_por_mes = df.groupby(by='order_purchase_month').order_products_value.sum()

type(vendas_por_mes)

# visualizando os valores de vendas por mes
vendas_por_mes.head()

vendas_por_mes.index

vendas_por_mes.values

# gráfico de linha - padrão do Plotly
data = [go.Scatter(x=vendas_por_mes.index,
                   y=vendas_por_mes.values)]

py.iplot(data)

data = [go.Bar(x=vendas_por_mes.index,
               y=vendas_por_mes.values,
               marker = {'color': 'lightblue'})]

# layout
configuracoes_layout = go.Layout(title='Vendas no Periodo',
                                 yaxis={'title':'Valores em Vendas'},
                                 xaxis={'title': 'Periodo'})

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)

# plotando o grafico
py.iplot(fig)

# ajustes em linhas e cores
# parâmetros opacity e width
data = [go.Bar(x=vendas_por_mes.index,
               y=vendas_por_mes.values,
               marker = {'color': 'lightblue',
                         'line': {'color': '#333',
                                  'width': 2}
                        },
               opacity= 0.7
              )
       ]

# layout
configuracoes_layout = go.Layout(title='Vendas no Periodo',
                                 yaxis={'title':'Valores em Vendas'},
                                 xaxis={'title':'Periodo'})

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)

# plotando o grafico
py.iplot(fig)

"""Destacando cores"""

vendas_por_mes.values

# media 
vendas_por_mes.values.mean()

cores = []
media = vendas_por_mes.values.mean()

for x in vendas_por_mes.values:
    if x < media:
        cores.append('red')
    else:
        cores.append('lightblue')

cores

import plotly.offline as py
import plotly.graph_objs as go

data = [go.Bar(x=vendas_por_mes.index,
               y=vendas_por_mes.values,
               marker = {'color': cores,  #lista de cores
                         'line': {'color': '#333',
                                  'width': 2}
                        },
               opacity= 0.7
              )
       ]

# layout
configuracoes_layout = go.Layout(title='Vendas no Periodo',
                                 yaxis={'title':'Valores em Vendas'},
                                 xaxis={'title':'Periodo'})

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)

# plotando o grafico
py.iplot(fig, filename='Meses que nao superaram a meta de vendas')

# Destaca a barra com o maior valor e minimiza a visao de todas as outras
maximo_de_vendas = vendas_por_mes.values.max()
maximo_de_vendas

cores = []
for x,y in zip(vendas_por_mes.values, vendas_por_mes.index):
    if x == maximo_de_vendas:
        mes_maximo_de_vendas = y
        cores.append('blue')
    else:
        cores.append('lightgray')

mes_maximo_de_vendas

cores

data = [go.Bar(x=vendas_por_mes.index,
               y=vendas_por_mes.values,
               marker = {'color': cores,
                         'line': {'color': '#333',
                                 'width': 2}
                        },
               opacity= 0.7
              )
       ]

# layout
configuracoes_layout = go.Layout(title='Vendas no Periodo',
                                 yaxis={'title':'Valores em Vendas'},
                                 xaxis={'title': 'Periodo'},
                                 # texto na barra de destaque
                                 annotations = [{'text':'Mês destaque de vendas',
                                                'x':mes_maximo_de_vendas,
                                                'y':maximo_de_vendas}
                                               ]
                                                                                              
                                )

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)

# plotando o grafico
py.iplot(fig, filename='Mes destaque de vendas')

# criando valores ficticios
vendas_ano_anterior = vendas_por_mes - 10000.00

data = [go.Bar(x=vendas_por_mes.index,
               y=vendas_por_mes.values,
               marker = {'color': cores,
                         'line': {'color': '#333',
                                  'width': 2}
                        },
               opacity= 0.7,
               name='2017'
              ),
# definindo outro plot de barras com valores dos meses passados
        
        go.Bar(x=vendas_ano_anterior.index,
               y=vendas_ano_anterior.values,
               name='2018',
               marker = {'color': 'lightgreen',
                         'line': {'color': '#333',
                                  'width': 2}
                        },
               opacity= 0.7
              )
              
       ]

# layout
configuracoes_layout = go.Layout(title='Vendas no Periodo',
                                 yaxis={'title':'Valores em Vendas'},
                                 xaxis={'title': 'Periodo'},
                                 annotations = [{'text':'Mês destaque de vendas',
                                                'x':mes_maximo_de_vendas,
                                                'y':maximo_de_vendas}
                                               ]                       
                                
                                )

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)

# plotando o grafico
py.iplot(fig, filename='Vendas no periodo 2017 e 2018')

"""Vendas por categorias de produtos"""

vendas_produto_por_categoria =  df.groupby(by='product_category_name').id.count()

vendas_produto_por_categoria

# filtrando categorias com quantidade de vendas maiores que 1
vendas_produto_por_categoria = vendas_produto_por_categoria.loc[vendas_produto_por_categoria.values >1]

# ordenando valores do maior para o menor
vendas_produto_por_categoria.sort_values(ascending=False,inplace=True)

# plotando gráfico de barras verticais
trace0 = go.Bar(y=vendas_produto_por_categoria.values,
                x=vendas_produto_por_categoria.index,
                marker = {'color': '#00FF2A'},
                orientation='v'
              )

data = [trace0]

# criando layout
configuracoes_layout = go.Layout(title='Vendas por categoria de Produtos',
                   xaxis=dict(
                         titlefont=dict(
                                   size=40,
                                   color='lightgrey'),
                   tickangle=90),
                   yaxis={'title': 'Quantidade vendida'})

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)

# plotando o grafico
py.iplot(fig)

"""Somando 10% ao Valor máximo"""

max(vendas_produto_por_categoria.values) * 1.10

trace0 = go.Bar(y=vendas_produto_por_categoria.values,
                x=vendas_produto_por_categoria.index,
                marker = {'color': '#00FF2A'},
                orientation='v'
              )

data = [trace0]

# layout
configuracoes_layout = go.Layout(title='Vendas por categoria de Produtos',
                   xaxis=dict(
                         titlefont=dict(
                                   size=40,
                                   color='lightgrey'),
                                   tickangle=90),
                   
                   # valor maximo da faixa + 10%
                   yaxis={'title': 'Quantidade vendida',
                          'range':[0,max(vendas_produto_por_categoria.values) * 1.10]
                         })

# figura

fig = go.Figure(data=data, layout=configuracoes_layout)
                   
# plotando o grafico
py.iplot(fig, filename='Vendas por categoria de Produtos')

# valor de Frete vs Valor de Produto: Existe alguma tendencia?

# criando gráfico
trace = go.Scatter(x = df['order_freight_value'],
                   y = df['order_products_value'],
                   mode = 'markers',
                   marker = {'color':'#941229'}
                  )
# armazenando gráfico em uma lista
data = [trace]

# criando Layout
layout = go.Layout(title='Valor de Frete x Valor de Produto',
                   yaxis={'title':'Valor do Produto'},
                   xaxis={'title': 'Valor do Frete'})

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# usando o parâmetro text na visualização (parâmetro hover)
# criando gráfico
trace = go.Scatter(x = df['order_freight_value'],
                   y = df['order_products_value'],
                   mode = 'markers',
                   # customização do texto a ser exibido no hover
                   text = 'Status do pedido: '+ df['order_status'] +
                           '<br>' + 'Classe: '+ df['most_voted_class']
                   ,
                   # exibição do hover
                   hoverinfo='text+x+y',
                   marker = {'color':'#941229'}
                  )
# armazenando gráfico em uma lista
data = [trace]

# layout
layout = go.Layout(title='Valor de Frete x Valor de Produto',
                   yaxis={'title':'Valor do Produto'},
                   xaxis={'title': 'Valor do Frete'})

# figura
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# costumizando os eixos em reais
# configurações
trace = go.Scatter(x = df['order_freight_value'],
                   y = df['order_products_value'],
                   mode = 'markers',
                   # customização do texto a ser exibido no hover
                   text = 'Status do pedido: '+ df['order_status'] +
                           '<br>' + 'Classe: '+ df['most_voted_class']
                   ,
                   # exibição do hover
                   hoverinfo='text+x+y',
                   marker = {'color':'#941229'}
                  )
# armazenando gráfico em uma lista
data = [trace]

# layout
layout = go.Layout(title='Valor de Frete x Valor de Produto',

                   # Definindo exibicao dos eixos x e y
                   yaxis={'title':'Valor do Produto', 
                          'tickformat':'.', 
                          'tickprefix':'R$ '},
                   xaxis={'title': 'Valor do Frete',
                          'tickformat':'.', 
                          'tickprefix':'R$ '})

# figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# Grafico de Bolhas: Valor de Frete vs Valor do Produto por numero de vendedores

# criando o gráfico
trace = go.Scatter(x = df['order_freight_value'],
                   y = df['order_products_value'],
                   mode = 'markers',
                   # customização do texto a ser exibido no hover
                   text = 'Status do pedido: '+ df['order_status'] +
                           '<br>' + 'Classe: '+ df['most_voted_class']
                   ,
                   # exibição do hover
                   hoverinfo='text+x+y',
                   
                   # parametro size e sizemode especifica o comportamento dos pontos
                   marker = {'color':'#941229',
                             'size': df['order_sellers_qty']*10,
                             'sizemode':'area'
                             }
                  )
# armazenando gráfico em uma lista
data = [trace]

# criando layout
layout = go.Layout(title='Valor de Frete x Valor de Produto',

                   # Definindo exibicao dos eixos x e y
                   yaxis={'title':'Valor do Produto', 
                          'tickformat':'.', 
                          'tickprefix':'R$ '},
                   xaxis={'title': 'Valor do Frete',
                          'tickformat':'.', 
                          'tickprefix':'R$ '})

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig, filename='Valor de Frete por Valor de Produto')

# Valor de Frete vs Valor de Produto por status de entrega


df.iplot(x='order_freight_value',
         y='order_products_value', 
         categories='most_voted_subclass',
         title='Valor de Frete vs Valor de Produto',
         xTitle='Valor de Frete',
         yTitle='Valor Produto')

# quantidade em média de items de um pedido
data = [go.Histogram(x=df.order_items_qty)]

layout = go.Layout(title='Quantidade média de itens de um pedido')

fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# quantidade média de vendedores de um pedido

trace1 = go.Histogram(x=df.order_items_qty,
                     name='itens',
                     opacity=0.75)

trace2 = go.Histogram(x=df.order_sellers_qty,
                     name='vendedores',
                     opacity=0.75)

layout = go.Layout(title='Quantidade de itens e Vendedores por pedido',
                   barmode='overlay'
                  )

dados = [trace1, trace2]

fig = go.Figure(data=dados, layout=layout)

py.iplot(fig, filename='Quantidade de itens e vendedores por pedido')

"""Qual a distribuição da classificação dos pedidos pelos clientes?

"""

df.order_status.value_counts()

classes_mais_votadas = df.groupby(by='most_voted_class').id.count()

classes_mais_votadas

# mesmo resultado do codigo acima
classes_mais_votadas = df.most_voted_class.value_counts()

# criando o gráfico

trace = go.Pie(labels = classes_mais_votadas.index,
               values = classes_mais_votadas.values
              )

# armazenando gráfico em uma lista

data = [trace]

# criando Layout

layout = go.Layout(title='Classificação de Clientes sobre Pedidos')

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# parametro direction
# criando gráfico

trace = go.Pie(labels = classes_mais_votadas.index,
               values = classes_mais_votadas.values,
               direction='clockwise'
              )

# armazenando gráfico em uma lista

data = [trace]

# criando layout

layout = go.Layout(title='Classificação de Clientes sobre Pedidos')

# figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# customizando
# criando gráfico

cores = ['#96D38C','#FEBFB3','#E1396C']


trace = go.Pie(labels = classes_mais_votadas.index,
               values = classes_mais_votadas.values,
               marker = {'colors': cores},
               direction='clockwise'
              )

# armazenando gráfico em uma lista

data = [trace]

# criando Layout

layout = go.Layout(title='Classificação de Clientes sobre Pedidos')

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# adicionando linha de contorno, cores
# criando gráfico

cores = ['#96D38C','#FEBFB3','#E1396C']


trace = go.Pie(labels = classes_mais_votadas.index,
               values = classes_mais_votadas.values,
               marker = {'colors': cores, 
                         'line' : {'color':'#000000','width':2}
                        },
               hoverinfo='label+percent+value',
               direction='clockwise'
              )

# armazenando gráfico em uma lista

data = [trace]

# criando layout

layout = go.Layout(title='Classificação de Clientes sobre Pedidos')

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# criando gráfico

cores = ['#96D38C','#FEBFB3','#E1396C']


trace = go.Pie(labels = classes_mais_votadas.index,
               values = classes_mais_votadas.values,
               marker = {'colors': cores, 
                         'line' : {'color':'#000000','width':2}
                        },
               hoverinfo='label+percent+value',
               pull=[0,0,0.1],
               direction='clockwise'
              )

# armazenando gráfico em uma lista

data = [trace]

# criando layout

layout = go.Layout(title='Classificação de Clientes sobre Pedidos')

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig)

# criando gráfico

cores = ['#96D38C','#FEBFB3','#E1396C']


trace = go.Pie(labels = classes_mais_votadas.index,
               values = classes_mais_votadas.values,
               marker = {'colors': cores, 
                         'line' : {'color':'#000000','width':2}
                        },
               hoverinfo='label+percent+value',
               pull=[0,0,0.1]
              )

# armazenando gráfico em uma lista

data = [trace]

# criando layout

layout = go.Layout(title='Classificação de Clientes sobre Pedidos')

# criando figura que será exibida
fig = go.Figure(data=data, layout=layout)

py.iplot(fig, filename='Classificação de Clientes sobre Pedidos')

"""Para ser possível exportar qualquer um dos gráficos para a nuvem é necessário:

  -  Criar conta no [plotly](https://plotly.com/)
  -  Obter credenciais da API
  -  Importar o método para plot online
  -  Substituir o método iplot() pelo método plot()


"""

# trabalhando online
import plotly
#plotly.tools.set_credentials_file(username='daniel.amador', api_key='0jXkDAS57ibh12xbbmrJ')

!pip install chart_studio -q

import chart_studio.plotly as py

"""# Obrigado!

Obrigado por ter disponibilizado um pouco do seu tempo e atenção aqui. Espero que, de alguma forma, tenha sido útil para seu crescimento. Se houver qualquer dúvida ou sugestão, não hesite em entrar em contato no [LinkedIn](https://www.linkedin.com/in/daniel-sousa-amador) e verificar meus outros projetos no [GitHub](https://github.com/amadords).

[![LinkedIn](https://img.shields.io/badge/LinkedIn-DanielSousaAmador-cyan.svg)](https://www.linkedin.com/in/daniel-sousa-amador)
[![GitHub](https://img.shields.io/badge/GitHub-amadords-darkblue.svg)](https://github.com/amadords)
[![Medium](https://img.shields.io/badge/Medium-DanielSousaAmador-white.svg)](https://daniel-s-amador.medium.com/)



<center><img width="90%" src="https://raw.githubusercontent.com/danielamador12/Portfolio/master/github.png"></center>
"""