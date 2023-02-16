#importacion de librerias que pueden necesitar
import pandas as pd
import csv
from datetime import datetime as d, timedelta as td,datetime as dt
from dateutil.relativedelta import relativedelta as rd
rd(years=1)
# use esta fecha para hacer los calculos de edad, no use el dt.today(),
#   FECHA A USARdt(2022, 1, 19)
#   FECHA A USARdt(2022, 1, 19)
#   FECHA A USARdt(2022, 1, 19)
#   FECHA A USARdt(2022, 1, 19)
#   FECHA A USARdt(2022, 1, 19)
#   FECHA A USARdt(2022, 1, 19)

now = dt(2022, 1, 19)

dtf = pd.read_csv("./carros.csv")
def dtFromTd(x:td):
    aux = dt.utcfromtimestamp(x.total_seconds())
    date0 = dt.utcfromtimestamp(0)
    return dt(aux.year-date0.year,aux.month, aux.day, aux.hour, aux.minute, aux.second)
def mapFunction1(x):
    shop = dt(x[1].Ano_Compra, x[1].Mes_Compra, x[1].Dia_Compra)
    old=rd(now, shop)
    return [
        f'La marca de tu automovil es {x[1].marca} {x[1].modelo} de color {x[1].color} y la placa es {x[1].placa}',
        f'El automovil de placa {x[1].placa}, fue comprado el {shop.strftime("%A, %d de %B de %Y")} y tiene {old.years} años, {old.months} meses y {old.days} días'
    ]
def UNO():
    x = [i for i in pd.core.common.flatten([y for y in map(mapFunction1, dtf.iterrows())])]
    return x

def nextValidDay(date,validDays):
    return response.strftime("%A, $d de %B de %Y");
def mapFunction2(x):
    print(x)
    alineacion = dt(x[1].Ano_Alineacion, x[1].Mes_Alineacion, x[1].Dia_Alineacion)
    return [
        f'La marca de tu automovil es {x[1].marca} {x[1].modelo} de color {x[1].color} y la placa es {x[1].placa}',
        alineacion.strftime('La última fecha de alineación realizada fue el %A, %d de %B de %Y'),
        'Las siguientes fechas de alineación programadas son:',
        [y for y in map(lambda x :nextValidDay(x,[0,1,2,3,4]), map(lambda x: alineacion + rd(years=y),range(1,4)))]
    ]
# aqui va su codigo
def DOS():
    x = [i for i in pd.core.common.flatten([y for y in map(mapFunction2, dtf.iterrows())])]
    return x


# aqui va su codigo

def TRES():
    pass


# aqui va su codigo


def cuadradosFor():
    pass


# aqui va su codigo

def cuadradosComprehion():
    pass


# aqui va su codigo

def cuadradosFilter():
    pass


# aqui va su codigo

def cuadrados():
    return []


# aqui va su codigo

# NO BORRAR
def switch_demo(argument):
    switcher = {
        1: UNO(),
        2: DOS(),
        3: TRES(),
        4: cuadradosFor(),
        5: cuadradosComprehion(),
        6: cuadradosFilter(),
        7: list(cuadrados())
    }
    return switcher.get(argument, "Llorelo papu")


if __name__ == "__main__":
    print(switch_demo(int(input())))
 #x = ['La marca de tu automovil es Renault Stepway de color Blanco y la placa es ABC999', 'El automovil de placa ABC999, fue comprado el Thursday, 12 de May de 2011 y tiene 10 años, 8 meses y 7 dias', 'La marca de tu automovil es Chevrolet Onix de color Rojo y la placa es EFR789', 'El automovil de placa EFR789, fue comprado el Tuesday, 03 de January de 2017 y tiene 5 años, 0 meses y 16 dias', 'La marca de tu automovil es Kia Sportage de color Negro y la placa es PPQ229', 'El automovil de placa PPQ229, fue comprado el Sunday, 25 de March de 2018 y tiene 3 años, 9 meses y 25 dias', 'La marca de tu automovil es Volkswagen Jetta de color Gris y la placa es EJR224', 'El automovil de placa EJR224, fue comprado el Saturday, 13 de June de 2020 y tiene 1 años, 7 meses y 6 dias', 'La marca de tu automovil es BMW Serie3 de color Negro y la placa es QAS153', 'El automovil de placa QAS153, fue comprado el Monday, 15 de November de 2010 y tiene 11 años, 2 meses y 4 dias', 'La marca de tu automovil es Kia Cerato de color Azul y la placa es EPD746', 'El automovil de placa EPD746, fue comprado el Monday, 21 de September de 2015 y tiene 6 años, 3 meses y 29 dias']
 #y = ['La marca de tu automovil es Renault Stepway de color Blanco y la placa es ABC999', 'El automovil de placa ABC999, fue comprado el Thursday, 12 de May de 2011 y tiene 10 años, 8 meses y 7 dias', 'La marca de tu automovil es Chevrolet Onix de color Rojo y la placa es EFR789', 'El automovil de placa EFR789, fue comprado el Tuesday, 03 de January de 2017 y tiene 5 años, 0 meses y 16 días', 'La marca de tu automovil es Kia Sportage de color Negro y la placa es PPQ229', 'El automovil de placa PPQ229, fue comprado el Sunday, 25 de March de 2018 y tiene 3 años, 9 meses y 25 días', 'La marca de tu automovil es Volkswagen Jetta de color Gris y la placa es EJR224', 'El automovil de placa EJR224, fue comprado el Saturday, 13 de June de 2020 y tiene 1 años, 7 meses y 6 días', 'La marca de tu automovil es BMW Serie3 de color Negro y la placa es QAS153', 'El automovil de placa QAS153, fue comprado el Monday, 15 de November de 2010 y tiene 11 años, 2 meses y 4 días', 'La marca de tu automovil es Kia Cerato de color Azul y la placa es EPD746', 'El automovil de placa EPD746, fue comprado el Monday, 21 de September de 2015 y tiene 6 años, 3 meses y 29 días']