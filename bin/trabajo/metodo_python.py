num1 = input("ingrese el primer numero ")
num2 = input("ingrese el segundo numero ")
num3 = input("ingrese el tercer numero ")
def num_mayor (num1, num2, num3):
    if num1 > num2 and num1 > num3 :
        return num1
    elif num2 > num1 and num2 > num3:
        return num2
    else :
        return num3

resultado = num_mayor( num1, num2, num3)
print("el numero mayor es " + resultado)