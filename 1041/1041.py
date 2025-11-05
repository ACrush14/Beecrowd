x, y = map(float, input().split(' '))

# switch:
#     case x>0 and y > 0:
#         print("Q1")
#     case x<0 and y > 0:
#         print("Q2")    
#     case x<0 and y < 0:
#         print("Q3")
#     case x>0 and y<0:
#         print("Q4")        
#     case x =0:
#         print("Eixo Y")        
#     case y= 0:
#         print("Eixo X") 
#     case x=0 and y =0:
#         print("Origem")

if x == 0 and y == 0:
    print("Origem")
elif x == 0:
    print("Eixo Y")
elif y == 0:
    print("Eixo X")
elif x>0 and y>0:
    print("Q1")
elif x<0 and y>0:
    print("Q2")
elif x<0 and y<0:
    print("Q3")
else:
    print("Q4")