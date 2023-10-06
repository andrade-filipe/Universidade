# -*- coding: utf-8 -*-
"""22042022Cassius.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/19gZjcEYnCCK1ObG6Eu4iloTIxoRzKxiZ
"""

#pacotes
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
#arquivos do colab drive
from google.colab import files
#abre a o arquivo do colab drive
import io

#files upload abre janela pra escolha de arquivo
uploaded = files.upload()
arquivo = next(iter(uploaded))
arquivo

#carregar a planilha
gfile_name = io.StringIO(uploaded[arquivo].decode('ISO 8859-1').strip())
dados = pd.read_csv(gfile_name,sep=';')
dados

#nome das colunas do arquivo
print(dados.columns.ravel())

#calculando a media de idade
media_idade = dados['idade'].mean()
print("media de idade: %.2f" %media_idade)

resume = dados['idade'].describe()
print(resume)

tabela = pd.DataFrame(dados)
tabela

#5 primeiros elementos
tabela.head()
#5 ultimos elementos
tabela.tail()

import matplotlib.pyplot as plt
nomes = dados['nome']
idade = dados['idade']
plt.bar(nomes, idade, color = 'purple')
plt.title('IDADES DOS PESQUISADOS')
plt.grid()
