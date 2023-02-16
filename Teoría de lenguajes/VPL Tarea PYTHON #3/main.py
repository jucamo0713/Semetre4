# #PUNTO UNO
# def all_subset(subset, elements, size, spinIndicator=0):
#     ac = []
#     sub = subset.copy()
#     if len(subset) == size:
#         ac.append("".join(map(lambda x: str(x), subset)))
#     elif len(elements) > spinIndicator:
#         ac += all_subset(sub, elements[1:len(elements)] + [elements[0]], size, spinIndicator + 1)
#         ac += all_subset(sub + [elements[0]], elements[1:len(elements)] + [elements[0]], size, 0)
#     return ac
#
#
# def permutaciones(list, size):
#     return all_subset([], list, size)
#
# def codigos():
#     digitos = permutaciones([9, 8, 7, 6, 5], 3)
#     letras = permutaciones(["P", "Q", "R", "W", "X", "Y", "Z"], 2)
#     especiales = permutaciones(["_", "#", "&", "%"], 1)
#     response=[]
#     for d in digitos:
#         for l in letras:
#             for e in especiales:
#                 response.append(d+l+e);
#     return response
# print("punto 1")
# print(codigos())
# print("=============")
# print("=============")
# print("=============")
# print("=============")
# print("=============")
# #punto2
# import pandas
#
# print("punto 2")
# #importar dataset
# data = pandas.read_csv('./all_seasons.csv')
# #imprimir primeros 5
# print(data.head(5))
# #Encontrar la longitud del dataset
# print(str(data.shape[0]) +" filas y " + str(data.shape[1]) + " columnas")
# #eliminar columnas
# print("columnas optimizadas")
# data = data.drop(columns=["college", "draft_round","draft_number","gp","pts","net_rating","oreb_pct","dreb_pct","usg_pct","ts_pct","ast_pct","reb","ast","country"])
# print(data.head(5))
# #obtener sudata de la ultima temporada
# subdata = data.loc[data["season"]=="2021-22"]
# print("datos temporada 2021-22")
# print(subdata.head(5))
# print(str(subdata.shape[0]) +" filas y " + str(subdata.shape[1]) + " columnas")
#
# #Obtener jugador mas joven de la temporada
# print("jugador mas joven")
# print(subdata.loc[subdata.idxmin(numeric_only=True).age])
# #Obtener jugador mas viejo de la temporada
# print("jugador mas viejo")
# print(subdata.loc[subdata.idxmax(numeric_only=True).age])
#
# #obtener promedio de edad de la temporada
# print("media de edad")
# print(subdata["age"].mean())
#
# #obtener desviacion estandar de estaturas de la temporada
#
# print("desviacion estandar estatura")
# print(subdata["player_height"].std())
#
# #agregar fila de puntajes
# print("agergar puntajes")
# subdata["points"] = subdata.age + subdata.player_height +subdata.player_weight
# print(subdata.head(5))
# #Obtener Equipos con mejores puntajes acosiados a sus jugadores (se hace con el promedio)
# print("mejores Equipos por promedio de puntajes")
# subDataTeam = subdata.groupby("team_abbreviation")["points"].mean()
# print(subDataTeam.sort_values(ascending=False).head(5))
#
# #Obtener Equipos con mejores puntajes acosiados a sus jugadores (se hace con la suma)
# print("mejores Equipos por suma de puntaje")
# subDataTeam = subdata.groupby("team_abbreviation")["points"].sum()
# print(subDataTeam.sort_values(ascending=False).head(5))
#
# print("=============")
# print("=============")
# print("=============")
# print("=============")
# print("=============")
# #PUNTO TRES
# import unittest
# class Scanner:
#     list=[("12345",7500),
#           ("23456",12400),
#           ("99999","Error código de barras no encontrado")]
#     def escanear(self, value= None):
#         if value is None:
#             return "Error: producto no encontrado"
#         else:
#             resul = [y for y in self.list if y[0]==value]
#             if len(resul) >=1:
#                 return resul[0][1]
#             else:
#                 return "Error: producto no encontrado"
#
# class test(unittest.TestCase):
#     def test12345(self):
#         t = Scanner()
#         self.assertTrue(t.escanear("12345") == 7500)
#     def test23456(self):
#         t = Scanner()
#         self.assertTrue(t.escanear("23456") == 12400)
#
#     def test99999(self):
#         t = Scanner()
#         self.assertTrue(t.escanear("99999") == "Error código de barras no encontrado")
#     def testvacio(self):
#         t = Scanner()
#         self.assertTrue(t.escanear() == "Error: producto no encontrado")
#
# sc = Scanner()
# x = int(input('Numero de productos: '))
# total = 0
#
# for i in range(x):
#     codigo= input('Ingresa codigo de barras: ')
#     try:
#         res = sc.escanear(codigo)
#         value = int(res)
#         total+=value
#     except:
#        print(res)
#        i -=1
#     codigo= None
#     res= None
#     value = None
# print('El total a pagar es: ' , total)

from functools import reduce
def function(l):
    return reduce(lambda x,y: x - y,l[::-1])
String = "20200202"
print(String[::-1])
print(function([1,2,9]))
x = """hola"""
print(x)