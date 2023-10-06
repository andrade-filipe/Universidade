# -*- coding: utf-8 -*-
"""06/05 cassius.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/11tBhH-61oDlwQWav01Gytk9tSFbS75nM
"""

!pip install sweetviz

import sweetviz as sv
import pandas as pd
from google.colab import files
import io

dados = pd.read_csv('dados_iris.csv',sep=';')
dados

relatorio = sv.analyze(dados)
relatorio.show_notebook()

relatorio = sv.compare([dados[dados['variety']=='Setosa'],"Setosa"],[dados[dados['variety']=='Virginica'],"Virginica"])
relatorio.show_notebook()

relatorio = sv.compare_intra(dados, dados['variety']=="Setosa",["Setosa", "Others"])
relatorio.show_notebook()

dados = pd.read_excel('dados_ecommerce.xlsx', sheet_name=None)
dados.keys()

# criando o relatório de clientes
relatorio_clientes = sv.analyze(dados['Clientes'])

# criando o relatório de pagamentos
relatorio_pagamentos = sv.analyze(dados['Pagamentos'])

# criando o relatório de itens
relatorio_itens = sv.analyze(dados['Itens'])

# criando o arquivo html e mostrando o relatório de clientes
relatorio_clientes.show_notebook(layout='widescreen',w='100%',h=900)